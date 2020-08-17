package com.dxctraining.inventorymgt.sprint3_phone.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.sprint1_supplier.entities.Supplier;
import com.dxctraining.inventorymgt.sprint2_item.entities.Item;

@Entity
@Table(name="phone_details")
public class Phone extends Item {

	private int storageSize;
	
	public Phone() {}

	public Phone(String name,Supplier supplier, int storageSize) {
		super(name,supplier);
		this.storageSize=storageSize;
		
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
