package com.dxctraining.inventorymgt_mvc.supplier.service;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.supplier.entities.Supplier;

public interface ISupplierService {

	void validate(Object obj);

	Supplier save(Supplier supplier);

	Supplier findSupplierById(int id);

	Supplier remove(int id);

	List<Supplier> allSuppliers();

	boolean authenticate(int id, String password);


}
