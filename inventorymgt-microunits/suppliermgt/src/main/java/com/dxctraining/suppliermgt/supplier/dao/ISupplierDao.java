package com.dxctraining.suppliermgt.supplier.dao;

import java.util.List;

import com.dxctraining.suppliermgt.supplier.entities.Supplier;

public interface ISupplierDao {
	
	Supplier save(Supplier supplier);

	Supplier findSupplierById(int id);

	Supplier remove(int id);

	Supplier update(Supplier supplier);


}
