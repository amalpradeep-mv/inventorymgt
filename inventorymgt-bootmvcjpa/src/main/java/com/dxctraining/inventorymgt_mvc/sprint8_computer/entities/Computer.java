package com.dxctraining.inventorymgt_mvc.sprint8_computer.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.dxctraining.inventorymgt_mvc.item.entities.Item;
import com.dxctraining.inventorymgt_mvc.sprint6_supplier.entities.Supplier;


@Entity
@Table(name="computer_details")
public class Computer extends Item {

	private int diskSize;

	public Computer() {
	}

	public Computer(String name, Supplier supplier, int diskSize) {
		super(name, supplier);
		this.diskSize = diskSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

	public int hashCode() {
		return getId();
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != getClass()) {
			return false;
		}
		Computer that = (Computer) obj;
		return this.diskSize == that.diskSize;
	}
}
