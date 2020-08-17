package com.dxctraining.inventorymgt.sprint3_phone.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.sprint3_phone.entities.Phone;
import com.dxctraining.inventorymgt.sprint3_phone.exception.PhoneNotFoundException;

@Repository
public class PhoneDaoImpl implements IPhoneDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Phone save(Phone phone) {
		em.persist(phone);
		return phone;
	}

	@Override
	public Phone findPhoneById(int id) {
		Phone phone = em.find(Phone.class, id);
		if (phone == null) {
			throw new PhoneNotFoundException("Phone not found");
		}
		return phone;
	}

	@Override
	public Phone remove(int id) {
		Phone phone = findPhoneById(id);
		em.remove(phone);
		return phone;
	}

}
