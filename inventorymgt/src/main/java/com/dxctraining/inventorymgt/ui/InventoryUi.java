package com.dxctraining.inventorymgt.ui;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.sprint1_supplier.entities.Supplier;
import com.dxctraining.inventorymgt.sprint1_supplier.exception.InvalidArgumentException;
import com.dxctraining.inventorymgt.sprint1_supplier.exception.SupplierNotFoundException;
import com.dxctraining.inventorymgt.sprint1_supplier.service.ISupplierService;
import com.dxctraining.inventorymgt.sprint2_item.entities.Item;
import com.dxctraining.inventorymgt.sprint2_item.exception.ItemNotFoundException;
import com.dxctraining.inventorymgt.sprint2_item.service.IItemService;
import com.dxctraining.inventorymgt.sprint3_phone.entities.Phone;
import com.dxctraining.inventorymgt.sprint3_phone.exception.PhoneNotFoundException;
import com.dxctraining.inventorymgt.sprint3_phone.service.IPhoneService;
import com.dxctraining.inventorymgt.sprint4_computer.entities.Computer;
import com.dxctraining.inventorymgt.sprint4_computer.exception.ComputerNotFoundException;
import com.dxctraining.inventorymgt.sprint4_computer.service.IComputerService;

@Component
public class InventoryUi {
	@Autowired
	private ISupplierService supplierService;

	@Autowired
	private IItemService itemService;

	@Autowired
	private IPhoneService phoneService;

	@Autowired
	private IComputerService compService;

	@PostConstruct
	public void run() {
		try {
			Supplier supplier1 = new Supplier("Sam");
			supplier1 = supplierService.save(supplier1);
			int id1 = supplier1.getId();
			Supplier supplier2 = new Supplier("John");
			supplier2 = supplierService.save(supplier2);
			int id2 = supplier2.getId();

			System.out.println("---Sprint 1 completed---");

			Item item1 = new Item("Head Set", supplier1);
			item1 = itemService.save(item1);
			Item item2 = new Item("Charger", supplier2);
			item2 = itemService.save(item2);

			System.out.println("---Sprint 2 completed---");

			Phone phone1 = new Phone("Samsung A30", supplier1, 32);
			phone1 = phoneService.save(phone1);
			Phone phone2 = new Phone("Honor 9 Lite", supplier2, 32);
			phone1 = phoneService.save(phone2);

			System.out.println("---Sprint 3 completed---");

			Computer comp1 = new Computer("HP Elitebook 765", supplier1, 228);
			comp1 = compService.save(comp1);
			Computer comp2 = new Computer("Acer Nitro 5", supplier2, 228);
			comp2 = compService.save(comp2);

			System.out.println("---Sprint 4 completed---");

			Supplier supplierFetched = supplierService.findSupplierById(id1);
			Phone phoneFetched = phoneService.findPhoneById(5);
			Computer compFetched = compService.findComputerById(7);
			System.out.println("Fetched Supplier= " + supplierFetched.getName() + " Id= " + supplierFetched.getId());
			System.out.println("Phone details= " + phoneFetched.getName() + " Id= " + phoneFetched.getId()+" Storage size in GB= " + phoneFetched.getStorageSize());
			System.out.println("Computer details= " + compFetched.getName() + " Id= " + compFetched.getId()+" Disk Size in GB= " + compFetched.getDiskSize());

		} catch (InvalidArgumentException e) {
			e.printStackTrace();
		} catch (SupplierNotFoundException e) {
			e.printStackTrace();
		} catch (ItemNotFoundException e) {
			e.printStackTrace();
		} catch (PhoneNotFoundException e) {
			e.printStackTrace();
		} catch (ComputerNotFoundException e) {
			e.printStackTrace();
		}
	}
}
