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

	public int hashCode() {
		int hashCode = id.hashCode();
		return hashCode;
	}

	public boolean equals(Object arg) {
		if (this == arg) {
			return true;
		} else if ((null == arg) || !(arg instanceof Author)) {
			return false;
		}
		Author that = (Author) arg;
		boolean isequals = this.id.equals(that.id);
		return isequals;
	}
}
