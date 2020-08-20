package com.dxctraining.inventorymgt_mvc.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxctraining.inventorymgt_mvc.sprint6_supplier.entities.Supplier;
import com.dxctraining.inventorymgt_mvc.sprint6_supplier.service.ISupplierService;
import com.dxctraining.inventorymgt_mvc.sprint7_phone.entities.Phone;
import com.dxctraining.inventorymgt_mvc.sprint7_phone.service.IPhoneService;
import com.dxctraining.inventorymgt_mvc.sprint8_computer.entities.Computer;
import com.dxctraining.inventorymgt_mvc.sprint8_computer.service.IComputerService;

@Controller
public class ControllerUi {

	@Autowired
	private ISupplierService supplierService;

	@Autowired
	private IPhoneService phoneService;

	@Autowired
	private IComputerService compService;

	@PostConstruct
	public void init() {

		Supplier supplier1 = new Supplier("John");
		int id1 = supplier1.getId();
		supplier1 = supplierService.save(supplier1);

		Supplier supplier2 = new Supplier("Sam");
		int id2 = supplier1.getId();
		supplier2 = supplierService.save(supplier2);

		System.out.println("---Sprint 6 completed---");

		Phone phone1 = new Phone("Samsung A30", supplier1, 32);
		phone1 = phoneService.save(phone1);
		Phone phone2 = new Phone("Honor 9 Lite", supplier2, 32);
		phone1 = phoneService.save(phone2);

		System.out.println("---Sprint 7 completed---");

		Computer comp1 = new Computer("HP Elitebook 765", supplier1, 228);
		comp1 = compService.save(comp1);
		Computer comp2 = new Computer("Acer Nitro 5", supplier2, 228);
		comp2 = compService.save(comp2);

		System.out.println("---Sprint 8 completed---");
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

	@GetMapping("/allphones")
	public ModelAndView allPhones() {
		List<Phone> values = phoneService.allPhones();
		ModelAndView modelAndView = new ModelAndView("plist", "phones", values);
		return modelAndView;
	}

	@GetMapping("/allcomputers")
	public ModelAndView allComputers() {
		List<Computer> values = compService.allComputers();
		ModelAndView modelAndView = new ModelAndView("clist", "computers", values);
		return modelAndView;
	}
}
