package com.dxctraining.inventorymgt_mvc.item.service;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.item.entities.Item;

public interface IItemService {

	void validate(Object arg);
	
	Item save(Item item);

	Item findItemById(int id);
	
	Item remove(int id);

	List<Item> allSuppliers();
}
