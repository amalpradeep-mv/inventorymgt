package com.dxctraining.inventorymgt.sprint2_item.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.sprint1_supplier.entities.Supplier;

@Entity
@Table(name = "item_details")
@Inheritance(strategy=InheritanceType.JOINED)
public class Item {

	@Id
	@GeneratedValue
	private int id;
	private String name;

	@ManyToOne
	private Supplier supplier;

	public Item() {
	}

	public Item(String name, Supplier supplier) {
		this.name = name;
		this.supplier = supplier;
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

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Item that = (Item) obj;
		return this.id == that.id;
	}

}
