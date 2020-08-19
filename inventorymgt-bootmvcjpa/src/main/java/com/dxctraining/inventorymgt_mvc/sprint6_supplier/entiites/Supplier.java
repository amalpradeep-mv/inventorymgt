package com.dxctraining.inventorymgt_mvc.sprint6_supplier.entiites;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="supplier_details")
public class Supplier {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
//	@OneToMany(mappedBy ="supplier")
//	private Set<Item> items;
	
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
	

/*	public Set<Item> getItem() {
		return items;
	}

	public void setItem(Set<Item> item) {
		this.items = items;
	}
*/

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
	}
		if (obj==null || getClass()!= obj.getClass()) {
			return false;
		}
		Supplier that = (Supplier) obj;
		return this.id==that.id;
	}
	
}
