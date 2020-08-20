package com.dxctraining.inventorymgt_mvc.supplier.dto;

public class CreateSupplierRequest {
	
	private String name;
	
	private String password;

	public CreateSupplierRequest() {}
	
	public CreateSupplierRequest(String name, String password) {
		this.name=name;
		this.password=password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
