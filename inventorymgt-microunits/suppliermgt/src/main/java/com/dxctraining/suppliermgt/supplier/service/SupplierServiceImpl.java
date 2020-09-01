package com.dxctraining.suppliermgt.supplier.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.suppliermgt.exception.SupplierNotFoundException;
import com.dxctraining.suppliermgt.supplier.dao.*;
import com.dxctraining.suppliermgt.supplier.entities.*;

@Transactional
@Service
public class SupplierServiceImpl implements ISupplierService {

	@Autowired
	private ISupplierDao dao;

	@Override
	public Supplier save(Supplier supplier) {
		supplier = dao.save(supplier);
		return supplier;
	}

	@Override
	public Supplier findById(int id) {
		Optional<Supplier> optional = dao.findById(id);
		if (!optional.isPresent()) {
			throw new SupplierNotFoundException("supplier not found for id=" + id);
		}
		Supplier supplier = optional.get();
		return supplier;
	}

	@Override
	public void remove(int id) {
		dao.deleteById(id);
	}

	@Override
	public List<Supplier> findAll() {
		List<Supplier> list = dao.findAll();
		return list;
	}

	@Override
	public List<Supplier> findByName(String name) {
		List<Supplier> list = dao.findByName(name);
		return list;
	}

}