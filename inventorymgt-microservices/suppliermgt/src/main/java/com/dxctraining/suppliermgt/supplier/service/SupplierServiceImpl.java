package com.dxctraining.suppliermgt.supplier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.suppliermgt.exception.InvalidArgumentException;
import com.dxctraining.suppliermgt.supplier.dao.*;
import com.dxctraining.suppliermgt.supplier.entities.*;

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
	public Supplier update(Supplier supplier) {
		validate(supplier);
		supplier = supplierDao.update(supplier);
		return supplier;
	}

	@Override
	public Supplier remove(int id) {
		validate(id);
		return supplierDao.remove(id);

	}
}
