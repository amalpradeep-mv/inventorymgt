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
	public void validate(int id) {
		if (id == 0) {
			throw new InvalidArgumentException("Id is not found");
		}
	}

	@Override
	public void validate(Supplier supplier) {
		if (supplier == null) {
			throw new SupplierNotFoundException("Supplier is not found");
		}
	}

	@Override
	public Supplier save(Supplier supplier) {
		validate(supplier);
		supplierDao.save(supplier);
		return supplier;
	}

	@Override
	public Supplier update(Supplier supplier) {
		validate(supplier);
		supplierDao.update(supplier);
		return supplier;
	}

	@Override
	public Supplier findSupplierById(int id) {
		validate(id);
		Supplier supplier = supplierDao.findSupplierById(id);
		return supplier;
	}

	@Override
	public Supplier findSupplierByName(String aname) {
		Supplier supplier = supplierDao.findSupplierByName(aname);
		return supplier;
	}

	@Override
	public Supplier remove(int id) {
		validate(id);
		return supplierDao.remove(id);

	}

}
