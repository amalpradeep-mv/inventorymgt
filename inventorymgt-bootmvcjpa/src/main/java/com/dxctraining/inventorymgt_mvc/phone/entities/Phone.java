package com.dxctraining.inventorymgt_mvc.phone.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.dxctraining.inventorymgt_mvc.item.entities.Item;
@Entity
@Table(name="phone_details")
public class Phone extends Item {

	private  String name;
	private int storageSize;
	
	public Phone() {}

	public Phone(String name, int storageSize) {
		this.name=name;
		this.storageSize=storageSize;
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}

	public int hashCode() {
		return getId();
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass() ) {
			return false;
		}
		Phone that = (Phone) obj;
		return this.storageSize == that.storageSize;

	}

}
