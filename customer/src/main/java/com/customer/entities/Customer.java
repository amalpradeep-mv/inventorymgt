package com.customer.entities;

public class Customer {
	private String name;
	private String id;
	private Account account;

	public Customer(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Customer(String name, String id, Account account) {
		this(name, id);
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
