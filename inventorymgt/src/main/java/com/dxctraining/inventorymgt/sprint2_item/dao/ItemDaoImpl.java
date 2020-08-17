package com.dxctraining.inventorymgt.sprint2_item.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.sprint2_item.entities.Item;
import com.dxctraining.inventorymgt.sprint2_item.exception.InvalidArgumentException;

@Repository
public class ItemDaoImpl implements IItemDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Item save(Item item) {
		em.persist(item);
		return item;
	}

	@Override
	public Item findItemById(int id) {
		Item item = em.find(Item.class, id);
		return item;
	}

	@Override
	public Item remove(int id) {
		Item item = findItemById(id);
		em.remove(item);
		return item;
	}

}
