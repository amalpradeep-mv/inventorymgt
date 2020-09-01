package com.dxctraining.suppliermgt.supplier.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dxctraining.suppliermgt.exception.util.SupplierUtil;
import com.dxctraining.suppliermgt.supplier.dto.CreateSupplierRequest;
import com.dxctraining.suppliermgt.supplier.dto.SupplierDto;
import com.dxctraining.suppliermgt.supplier.entities.Supplier;
import com.dxctraining.suppliermgt.supplier.service.ISupplierService;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

	@Autowired
	private ISupplierService supplierService;
	
	@Autowired
	private SupplierUtil util;

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public SupplierDto create(@RequestBody CreateSupplierRequest requestData) {
		Supplier supplier=new Supplier();
		supplier.setName(requestData.getName());
		supplier.setPassword(requestData.getPassword());
		supplier = supplierService.save(supplier);
		SupplierDto response = util.supplierDto(supplier);
		return response;
	}

	@GetMapping("/get/{id}")
	@ResponseStatus(HttpStatus.OK)
	public SupplierDto findSupplierBy(@PathVariable("id") int id) {
		Supplier supplier = supplierService.findById(id);
		SupplierDto response = util.supplierDto(supplier);
		return response;
	}

	public List<SupplierDto> fetchAll(){
		List<Supplier>list=supplierService.findAll();
		List<SupplierDto> response=new ArrayList<>();
		for(Supplier supplier:list) {
			SupplierDto dto=util.supplierDto(supplier);
			response.add(dto);
		}
		return response;
	}
}
