package com.dxctraining.inventorymgt.sprint1_supplier.dao;

import com.dxctraining.inventorymgt.sprint1_supplier.entities.Supplier;

public interface ISupplierDao {
	
	Supplier save(Supplier supplier);

	Supplier findSupplierById(int id);

	Supplier remove(int id);
}
