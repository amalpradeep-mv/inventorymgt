package com.dxctraining.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.dxctraining.entities.Item;
import com.dxctraining.exceptions.ItemNotFoundException;

@Repository
public class ItemDaoImpl implements IItemDao {

	@PersistenceContext // this is equivalent to @Autowired
	private EntityManager em;

	@Override
	public Item findItemById(int id) {
		Item item = em.find(Item.class, id);
		if (item == null) {
			throw new ItemNotFoundException("Item not found for the id= " + id);
		}
		return item;
	}

	@Override
	public Item update(Item item) {
		item = em.merge(item);
		return item;
	}

	@Override
	public Item save(Item item) {
		em.persist(item);
		return item;
	}

	@Override
	public void remove(int id) {
		Item item = em.find(Item.class, id);
		em.remove(item);
	}


}
