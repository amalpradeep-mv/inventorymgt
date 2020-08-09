package org.dxctraining.entities;

public class RoyalGuest extends Guest {
	private String address;

	public RoyalGuest(String name, String id, String address) {
		super(name, id);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
