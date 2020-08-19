package com.dxctraining.inventorymgt_mvc.sprint6_supplier.dao;

import com.dxctraining.inventorymgt_mvc.sprint6_supplier.entiites.Supplier;

public interface ISupplierDao {
	
	Supplier save(Supplier supplier);

	Supplier findSupplierById(int id);

	Supplier remove(int id);
}
