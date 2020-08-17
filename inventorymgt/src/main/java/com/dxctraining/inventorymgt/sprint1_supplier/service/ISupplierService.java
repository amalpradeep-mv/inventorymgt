package com.dxctraining.inventorymgt.sprint1_supplier.service;

import com.dxctraining.inventorymgt.sprint1_supplier.entities.Supplier;

public interface ISupplierService {

	void validate(Object obj);

	Supplier save(Supplier supplier);

	Supplier findSupplierById(int id);

	Supplier remove(int id);

}
