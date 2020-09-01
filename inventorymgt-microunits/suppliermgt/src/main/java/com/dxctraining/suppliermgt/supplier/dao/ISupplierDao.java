package com.dxctraining.suppliermgt.supplier.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dxctraining.suppliermgt.supplier.entities.Supplier;

public interface ISupplierDao extends JpaRepository<Supplier, Integer>{
	

	List<Supplier> findByName(String name);


}
