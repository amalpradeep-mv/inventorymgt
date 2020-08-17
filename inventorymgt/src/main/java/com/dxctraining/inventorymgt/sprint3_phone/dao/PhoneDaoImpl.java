package com.dxctraining.inventorymgt.sprint3_phone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	public Phone update(Phone phone) {
		em.merge(phone);
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
	public Phone findPhoneByName(String pname) {
		String jpaQuery = "from Phone where name=:pname";
		Query query = em.createQuery(jpaQuery);
		query.setParameter("pname", pname);
		List<Phone> list = query.getResultList();
		Phone phone = null;
		if (!list.isEmpty()) {
			phone = list.get(0);
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
