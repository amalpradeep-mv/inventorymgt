package com.dxctraining.inventorymgt.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.sprint1_supplier.entities.Supplier;
import com.dxctraining.inventorymgt.sprint1_supplier.service.ISupplierService;
import com.dxctraining.inventorymgt.sprint2_item.entities.Item;
import com.dxctraining.inventorymgt.sprint2_item.service.IItemService;

@Component
public class ItemUi {
	@Autowired
	private ISupplierService supplierService;

	@Autowired
	private IItemService itemService;

	@PostConstruct
	public void run() {
		Supplier supplier1 = new Supplier("Sam");
		supplier1 = supplierService.save(supplier1);
		int id1 = supplier1.getId();
		Item item1 = new Item("Computer", supplier1);
		item1 = itemService.save(item1);

		Supplier supplier2=new Supplier("John");
		supplier2=supplierService.save(supplier2);
		int id2=supplier2.getId();
		Item item2=new Item("Phone",supplier2);
		item2=itemService.save(item2);
		
		Supplier fetched1 = supplierService.findSupplierByName("Sam");
		System.out.println("Fetched Supplier= " + fetched1.getName() + " " + fetched1.getId());
	
		Supplier fetched2=supplierService.findSupplierById(id2);
		System.out.println("Fetched Supplier= "+fetched2.getName()+" "+fetched2.getId());
	}
}