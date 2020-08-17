package com.dxctraining.inventorymgt.sprint1_supplier.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.dxctraining.inventorymgt.sprint1_supplier.entities.Supplier;
import com.dxctraining.inventorymgt.sprint1_supplier.exception.*;

@Repository
public class SupplierDaoImpl implements ISupplierDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Supplier save(Supplier supplier) {
		em.persist(supplier);
		return supplier;
	}

	@Override
	public Supplier findSupplierById(int id) {
		Supplier supplier = em.find(Supplier.class, id);
		if (supplier == null) {
			throw new SupplierNotFoundException("Supplier not found");
		}
		return supplier;
	}

	@Override
	public Supplier remove(int id) {
		Supplier supplier = findSupplierById(id);
		em.remove(supplier);
		return supplier;
	}
}
