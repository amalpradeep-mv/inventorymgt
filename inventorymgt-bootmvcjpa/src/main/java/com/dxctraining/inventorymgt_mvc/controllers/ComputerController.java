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
import com.dxctraining.inventorymgt_mvc.item.entities.Item;
import com.dxctraining.inventorymgt_mvc.supplier.entities.Supplier;
import com.dxctraining.inventorymgt_mvc.supplier.service.ISupplierService;

@Controller
public class ComputerController extends Item{

	@Autowired
	private IComputerService compService;

	@Autowired
	private ISupplierService supplierService;

	@PostConstruct
	public void init() {

		Supplier supplier1 = new Supplier("Krish", "qwerty");
		supplier1 = supplierService.save(supplier1);

		Supplier supplier2 = new Supplier("Arvaind", "qwerty");
		supplier2 = supplierService.save(supplier2);
		
		Computer comp1 = new Computer("HP Elitebook 765",228);
		comp1 = compService.save(comp1);
		Computer comp2 = new Computer("Acer Nitro 5",  228);
		comp2 = compService.save(comp2);

	}
	@GetMapping("/computer")
	public ModelAndView computerDetails(@RequestParam("id") int id) {
		Computer computer = compService.findComputerById(id);
		ModelAndView modelAndView = new ModelAndView("cdetails", "computer", computer);
		return modelAndView;
	}
	
	@GetMapping("/allcomputers")
	public ModelAndView allComputers() {
		List<Computer> values = compService.allComputers();
		ModelAndView modelAndView = new ModelAndView("clist", "computers", values);
		return modelAndView;
	}
	@GetMapping("/computerregister")
	public ModelAndView registerComputerr() {
		ModelAndView mv = new ModelAndView("cregister");
		return mv;
	}

	@GetMapping("/computerprocessregister")
	public ModelAndView processRegister(@RequestParam("name") String name, @RequestParam("diskSize") int diskSize) {
		System.out.println("inside processregister method, name=" + name);
		Computer computer = new Computer(name,diskSize);
		computer = compService.save(computer);
		ModelAndView mv = new ModelAndView("cdetails", "computer", computer);
		return mv;
	}
}
