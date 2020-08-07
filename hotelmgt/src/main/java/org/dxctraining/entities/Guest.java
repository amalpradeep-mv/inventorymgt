package org.dxctraining.entities;

public class Guest {

	private String name;
	private String id;

	public Guest(String name, String id) {
		this.name = name;
		this.id = id;
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
		int hashcode = id.hashCode();
		return hashcode;
	}

	public boolean equals(Object arg) {
		if (this == arg) {
			return true;
		} else if ((arg == null) || !(arg instanceof Guest)) {
			return false;
		}
		Guest that = (Guest) arg;
		boolean isequal = this.id.equals(that.id);
		return isequal;
	}
}
