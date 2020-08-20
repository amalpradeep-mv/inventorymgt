package com.dxctraining.inventorymgt_mvc.supplier.dao;

import java.util.List;

import com.dxctraining.inventorymgt_mvc.supplier.entities.Supplier;

public interface ISupplierDao {
	
	Supplier save(Supplier supplier);

	Supplier findSupplierById(int id);

	Supplier remove(int id);

	List<Supplier> allSuppliers();

	Supplier update(Supplier supplier);
}
