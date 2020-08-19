package com.dxctraining.inventorymgt_mvc.sprint7_item.service;

import com.dxctraining.inventorymgt_mvc.sprint7_item.entities.Item;

public interface IItemService {

	void validate(Object arg);
	
	Item save(Item item);

	Item findItemById(int id);
	
	Item remove(int id);
}
