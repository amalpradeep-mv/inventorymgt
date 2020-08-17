package com.dxctraining.inventorymgt.sprint2_item.service;

import com.dxctraining.inventorymgt.sprint2_item.entities.Item;

public interface IItemService {

	void validate(Item item);
	
	void validate(int id);
	
	Item save(Item item);

	Item update(Item item);

	Item findItemById(int id);

	Item findItemByName(String iname);
	
	Item remove(int id);
}
