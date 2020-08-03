package org.dxctraining.authormgt.entities;

public class Author {

	private String id;
	private String name;

	public Author(String name, String id) {
		this.setName(name);
		this.setId(id);
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

}
