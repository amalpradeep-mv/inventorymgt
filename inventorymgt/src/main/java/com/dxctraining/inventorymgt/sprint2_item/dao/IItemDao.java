package com.dxctraining.inventorymgt.sprint2_item.dao;

import com.dxctraining.inventorymgt.sprint2_item.entities.Item;

public interface IItemDao {
	
	Item save(Item item);

	Item findItemById(int id);
	
	Item remove(int id);
}
