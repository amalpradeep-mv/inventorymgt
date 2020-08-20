package com.dxctraining.inventorymgt_mvc.item.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt_mvc.item.entities.Item;

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

	@Override
	 public List<Item> allSuppliers() {
       String jpaql="from Item";
       TypedQuery<Item>query=em.createQuery(jpaql,Item.class);
       List<Item>itemList=query.getResultList();
       return itemList;
   }
}
