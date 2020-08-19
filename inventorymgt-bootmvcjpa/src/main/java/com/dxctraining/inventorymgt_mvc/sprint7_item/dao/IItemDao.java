package com.dxctraining.inventorymgt_mvc.sprint7_item.dao;

import com.dxctraining.inventorymgt_mvc.sprint7_item.entities.Item;

public interface IItemDao {
	
	Item save(Item item);

	Item findItemById(int id);
	
	Item remove(int id);
}
