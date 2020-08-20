package com.dxctraining.inventorymgt_mvc.item.dao;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.item.entities.Item;

public interface IItemDao {
	
	Item save(Item item);

	Item findItemById(int id);
	
	Item remove(int id);

	List<Item> allSuppliers();
}
