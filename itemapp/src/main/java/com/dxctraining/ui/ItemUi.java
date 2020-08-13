package com.dxctraining.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

import com.dxctraining.entities.*;
import com.dxctraining.exceptions.*;
import com.dxctraining.service.*;

@Component
public class ItemUi {

	@Autowired
	private IItemService service;

	@PostConstruct
	public void runUi() {
		try {
			// Item item1 = new Item("Table", 1);
			// Item item2 = new Item("Chair", 2);
			Item item1 = new Item("Table");
			Item item2 = new Item("Chair");

			item1 = service.save(item1);
			item2 = service.save(item2);

			int id1 = item1.getId();
			int id2 = item2.getId();

			Item fetched1 = service.findItemById(id1);
			System.out.println("Fetched item= " + fetched1.getName() + " " + fetched1.getId());

			Item fetched2 = service.findItemById(id2);
			System.out.println("Fetched item= " + fetched2.getName() + " " + fetched2.getId());
		} catch (ItemNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
		}
	}
}
