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
	public void validate(Item item) {
		if (item == null) {
			throw new ItemNotFoundException("Item is not found");
		}
	}

	@Override
	public void validate(int id) {
		if (id == 0) {
			throw new InvalidArgumentException("Id is not found");
		}
	}

	@Override
	public Item save(Item item) {
		validate(item);
		itemDao.save(item);
		return item;
	}

	@Override
	public Item update(Item item) {
		validate(item);
		itemDao.update(item);
		return item;
	}

	@Override
	public Item findItemById(int id) {
		validate(id);
		Item item = itemDao.findItemById(id);
		return item;
	}

	@Override
	public Item findItemByName(String iname) {
		Item item = itemDao.findItemByName(iname);
		return item;
	}

	@Override
	public Item remove(int id) {
		validate(id);
		Item item = itemDao.remove(id);
		return item;
	}

}
