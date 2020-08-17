package com.dxctraining.inventorymgt.sprint2_item.service;

import com.dxctraining.inventorymgt.sprint2_item.entities.Item;

public interface IItemService {

	void validate(Object arg);
	
	Item save(Item item);

	Item findItemById(int id);
	
	Item remove(int id);
}
