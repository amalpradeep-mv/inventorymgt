package com.dxctraining.inventorymgt_mvc.sprint6_supplier.service;

import com.dxctraining.inventorymgt_mvc.sprint6_supplier.entiites.Supplier;

public interface ISupplierService {

	void validate(Object obj);

	Supplier save(Supplier supplier);

	Supplier findSupplierById(int id);

	Supplier remove(int id);

}
