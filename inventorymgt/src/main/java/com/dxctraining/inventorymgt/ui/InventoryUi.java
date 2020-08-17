package com.dxctraining.inventorymgt.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.service.ISupplierService;

@Component
public class InventoryUi {

	@Autowired
	private ISupplierService supplierService;
	
	@PostConstruct
	public void run() {
		Supplier s1=new Supplier("Sam");
		s1=supplierService.save(s1);
		int id1=s1.getId();
		Supplier s2=new Supplier("John");
		s2=supplierService.save(s2);
		int id2=s1.getId();
		
		Supplier fetched1=supplierService.findSupplierByName("Sam");
		System.out.println("Fetched Supplier= "+fetched1.getId());
		
		Supplier fetched2=supplierService.findSupplierById(id2);
		System.out.println("Fetched Supplier= "+fetched2.getName());
	}
}
