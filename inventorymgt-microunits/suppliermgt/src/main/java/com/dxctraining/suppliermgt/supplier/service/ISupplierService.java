package com.dxctraining.suppliermgt.supplier.service;

import java.util.List;

import com.dxctraining.suppliermgt.supplier.entities.Supplier;

public interface ISupplierService {

	void validate(Object obj);

	Supplier save(Supplier supplier);

	Supplier findSupplierById(int id);

	Supplier remove(int id);

	boolean authenticate(int id, String password);

	Supplier update(Supplier supplier);


}
