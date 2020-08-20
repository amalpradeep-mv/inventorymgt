package com.dxctraining.inventorymgt_mvc.controllers;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.dxctraining.inventorymgt_mvc.supplier.dto.CreateSupplierRequest;
import com.dxctraining.inventorymgt_mvc.supplier.dto.SessionData;
import com.dxctraining.inventorymgt_mvc.supplier.dto.SupplierDto;

@Controller
public class SupplierController {

	@Autowired
	private SessionData sessionData;

	@Autowired
	private RestTemplate restTemplate;

	private final String baseUrl = "http://localhost:8585/suppliers";

	@GetMapping("/supplier")
	public ModelAndView supplierDetails(@RequestParam("id") int id) {
		if (!sessionData.isLoggedIn()) {
			return new ModelAndView("login");
		}
		SupplierDto supplier = findSupplierById(id);
		ModelAndView modelAndView = new ModelAndView("details", "supplier", supplier);
		return modelAndView;
	}

	@GetMapping("/allsuppliers")
	public ModelAndView allSuppliers() {
		if (!sessionData.isLoggedIn()) {
			return new ModelAndView("login");
		}
		String url = baseUrl;
		SupplierDto[] array = restTemplate.getForObject(url, SupplierDto[].class);
		List<SupplierDto> list = Arrays.asList(array);
		ModelAndView modelAndView = new ModelAndView("list", "suppliers", list);
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
		CreateSupplierRequest supplier = new CreateSupplierRequest(name, password);
		String url = baseUrl + "/add";
		SupplierDto supplierDto = restTemplate.postForObject(url, supplier, SupplierDto.class);
		ModelAndView mv = new ModelAndView("details", "supplier", supplierDto);
		return mv;
	}
	
	@GetMapping("/postregister")
	public ModelAndView postRegisterPage() {
		System.out.println("inside registerpage method");
		CreateSupplierRequest requestData = new CreateSupplierRequest();
		ModelAndView mv = new ModelAndView("postregister", "supplier", requestData);
		return mv;
	}

	/**
	 *
	 * processing register form submission here
	 */
	@PostMapping("/processpostregister")
	public ModelAndView processRegister(@ModelAttribute("supplier") CreateSupplierRequest requestData) {
		String name = requestData.getName();
		String password = requestData.getPassword();
		System.out.println("inside processregister method, name=" + name );
		String url = baseUrl + "/add";
		SupplierDto supplierDto = restTemplate.postForObject(url, requestData, SupplierDto.class);
		ModelAndView mv = new ModelAndView("details", "supplier", supplierDto);
		return mv;
	}

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	@GetMapping("/processlogin")
	public ModelAndView processLogin(@RequestParam("id") int id, @RequestParam("password") String password) {
		String url = baseUrl + "/authenticate/" + id + "/" + password;
		boolean correct = restTemplate.getForObject(url, Boolean.class);
		if (!correct) {
			ModelAndView modelAndView = new ModelAndView("login");
			return modelAndView;
		}
		sessionData.saveLogin(id);
		SupplierDto supplier = findSupplierById(id);
		ModelAndView mv = new ModelAndView("details", "supplier", supplier);
		return mv;
	}
	
	

	@GetMapping("/logout")
	public ModelAndView logout() {
		sessionData.clear();
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	public SupplierDto findSupplierById(int id) {
		String url = baseUrl + "/get/" + id;
		SupplierDto supplier = restTemplate.getForObject(url, SupplierDto.class);
		return supplier;
	}

}
