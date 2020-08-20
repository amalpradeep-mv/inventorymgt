package com.dxctraining.inventorymgt_mvc.item.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dxctraining.inventorymgt_mvc.supplier.entities.Supplier;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "item_details")
public class Item {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;

	@ManyToOne
	private Supplier supplier;

	public Item() {	}

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
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj==null || getClass() != obj.getClass()) {
			return false;
		}
		Item that = (Item) obj;
		return this.id == that.id;
	}

}
