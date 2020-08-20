package com.dxctraining.inventorymgt_mvc.sprint6_supplier.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dxctraining.inventorymgt_mvc.item.entities.Item;

@Entity
@Table(name = "supplier_details")
public class Supplier {

	@Id
	@GeneratedValue
	private int id;
	private String name;

	public Supplier() {
	}

	public Supplier(String name) {
		this.name = name;
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
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Supplier that = (Supplier) obj;
		return this.id == that.id;
	}

}
