package com.dxctraining.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.*;


@Entity
@Table(name="item")
public class Item {

	@GeneratedValue
	@Id
	private int id;
	private String name;
	
	public Item() {

	}

	public Item(String name, int id) {
		this.name = name;
		this.id=id;
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
		Item that = (Item) obj;
		boolean isequals = this.id == that.id;
		return isequals;
	}
}
