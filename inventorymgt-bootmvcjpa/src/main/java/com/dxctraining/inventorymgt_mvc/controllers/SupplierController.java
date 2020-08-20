package com.dxctraining.inventorymgt_mvc.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxctraining.inventorymgt_mvc.computer.entities.Computer;
import com.dxctraining.inventorymgt_mvc.computer.service.IComputerService;
import com.dxctraining.inventorymgt_mvc.phone.entities.Phone;
import com.dxctraining.inventorymgt_mvc.phone.service.IPhoneService;
import com.dxctraining.inventorymgt_mvc.supplier.dto.SessionData;
import com.dxctraining.inventorymgt_mvc.supplier.entities.Supplier;
import com.dxctraining.inventorymgt_mvc.supplier.service.ISupplierService;

@Controller
public class SupplierController {

	@Autowired
	private ISupplierService supplierService;
	
	@Autowired
	private SessionData sessionData;

	@PostConstruct
	public void init() {

		Supplier supplier1 = new Supplier("John", "qwerty");
		int id1 = supplier1.getId();
		supplier1 = supplierService.save(supplier1);

		Supplier supplier2 = new Supplier("Sam", "qwerty");
		int id2 = supplier1.getId();
		supplier2 = supplierService.save(supplier2);

	}

	@GetMapping("/supplier")
	public ModelAndView supplierDetails(@RequestParam("id") int id) {
		Supplier supplier = supplierService.findSupplierById(id);
		ModelAndView modelAndView = new ModelAndView("details", "supplier", supplier);
		return modelAndView;
	}

	@GetMapping("/allsuppliers")
	public ModelAndView allSuppliers() {
		List<Supplier> values = supplierService.allSuppliers();
		ModelAndView modelAndView = new ModelAndView("list", "suppliers", values);
		return modelAndView;
	}

	@GetMapping("/register")
	public ModelAndView registerSupplier() {
		ModelAndView mv = new ModelAndView("register");
		return mv;
	}

	@GetMapping("/processregister")
	public ModelAndView processRegister(@RequestParam("name") String name, @RequestParam("password") String password) {
		System.out.println("inside processregister method, name=" + name);
		Supplier supplier = new Supplier(name, password);
		supplier = supplierService.save(supplier);
		ModelAndView mv = new ModelAndView("details", "supplier", supplier);
		return mv;
	}

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	@GetMapping("/processlogin")
	public ModelAndView processLogin( @RequestParam("id") int id, @RequestParam("password") String password) {
		boolean correct = supplierService.authenticate(id, password);
		if (!correct) {
			ModelAndView modelAndView = new ModelAndView("login");
			return modelAndView;
		}
		sessionData.saveLogin(id);
		Supplier supplier = supplierService.findSupplierById(id);
		ModelAndView mv = new ModelAndView("details", "supplier", supplier);
		return mv;
	}

	@GetMapping("/logout")
	public ModelAndView logout() {
		sessionData.clear();
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

}
