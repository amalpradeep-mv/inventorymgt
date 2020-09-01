package com.dxctraining.suppliermgt.supplier.service;

import java.util.List;

import com.dxctraining.suppliermgt.supplier.entities.Supplier;

public interface ISupplierService {

	Supplier save(Supplier supplier);

	Supplier findById(Integer id);

	void remove(Integer id);

	List<Supplier> findAll();

	List<Supplier> findByName(String name);
}
