package com.dxctraining.inventorymgt.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.sprint1_supplier.entities.Supplier;
import com.dxctraining.inventorymgt.sprint1_supplier.service.ISupplierService;
import com.dxctraining.inventorymgt.sprint2_item.entities.Item;
import com.dxctraining.inventorymgt.sprint2_item.service.IItemService;
import com.dxctraining.inventorymgt.sprint3_phone.entities.Phone;
import com.dxctraining.inventorymgt.sprint3_phone.service.IPhoneService;

@Component
public class InventoryUi {
	@Autowired
	private ISupplierService supplierService;

	@Autowired
	private IItemService itemService;

	@Autowired
	private IPhoneService phoneService;

	@PostConstruct
	public void run() {
		Supplier supplier1 = new Supplier("Sam");
		supplier1 = supplierService.save(supplier1);
		int id1 = supplier1.getId();
		Item item1 = new Phone("Samsung", supplier1, 32);
		item1 = itemService.save(item1);

		Supplier supplier2 = new Supplier("John");
		supplier2 = supplierService.save(supplier2);
		int id2 = supplier2.getId();
		Item item2 = new Phone("Nokia", supplier2, 16);
		item2 = itemService.save(item2);

		Supplier fetched = supplierService.findSupplierById(id2);
		Phone fetched1 = phoneService.findPhoneByName("Nokia");
		System.out.println("Fetched Supplier= " + fetched.getName() + " Id= " + fetched.getId()
				+ " Fetched Phone details=" + fetched1.getName() + " Size= " + fetched1.getStorageSize());

		Supplier fetched2 = supplierService.findSupplierByName("Sam");
		Phone fetched3 = phoneService.findPhoneByName("Samsung");
		System.out.println("Fetched Supplier= " + fetched2.getName() + " id= " + fetched2.getId()
				+ " Fetched Phone details=" + fetched3.getName() + " Size= " + fetched3.getStorageSize());
	}

}
