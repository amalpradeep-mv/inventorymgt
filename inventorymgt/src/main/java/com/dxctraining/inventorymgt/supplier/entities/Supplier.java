package com.dxctraining.inventorymgt.supplier.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplier_details")
public class Supplier {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	public Supplier() {}
	
	public Supplier(String name) {
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
	}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Supplier that = (Supplier) obj;
		return this.id==that.id;
	}
	
}
