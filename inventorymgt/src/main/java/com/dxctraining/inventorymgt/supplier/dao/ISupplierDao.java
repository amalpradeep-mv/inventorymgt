package com.dxctraining.inventorymgt.supplier.dao;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public interface ISupplierDao {

	Supplier save(Supplier supplier);

	Supplier update(Supplier supplier);

	Supplier findSupplierById(int id);

	Supplier findSupplierByName(String aname);
	
	Supplier remove(int id);
}
