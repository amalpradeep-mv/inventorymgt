package com.dxctraining.inventorymgt.sprint2_item.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.inventorymgt.sprint2_item.dao.IItemDao;
import com.dxctraining.inventorymgt.sprint2_item.entities.Item;
import com.dxctraining.inventorymgt.sprint2_item.exception.*;

@Transactional
@Service
public class ItemServiceImpl implements IItemService {

	@Autowired
	private IItemDao itemDao;

	@Override
	public void validate(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("Argument is null");
		}
	}

	@Override
	public Item save(Item item) {
		validate(item);
		itemDao.save(item);
		return item;
	}

	@Override
	public Item findItemById(int id) {
		validate(id);
		Item item = itemDao.findItemById(id);
		return item;
	}

	@Override
	public Item remove(int id) {
		validate(id);
		Item item = itemDao.remove(id);
		return item;
	}

}
