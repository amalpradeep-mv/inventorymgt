package com.dxctraining.inventorymgt.sprint1_supplier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.inventorymgt.sprint1_supplier.dao.*;
import com.dxctraining.inventorymgt.sprint1_supplier.entities.*;
import com.dxctraining.inventorymgt.sprint1_supplier.exception.*;

@Transactional
@Service
public class SupplierServiceImpl implements ISupplierService {

	@Autowired
	private ISupplierDao supplierDao;

	@Override
	public void validate(Object obj) {
		if (obj == null) {
			throw new InvalidArgumentException("Argument is null");
		}
	}

	@Override
	public Supplier save(Supplier supplier) {
		validate(supplier);
		supplierDao.save(supplier);
		return supplier;
	}
	@Override
	public Supplier findSupplierById(int id) {
		validate(id);
		Supplier supplier = supplierDao.findSupplierById(id);
		return supplier;
	}
		@Override
		public Supplier remove(int id) {
			validate(id);
			return supplierDao.remove(id);

		}

	}
