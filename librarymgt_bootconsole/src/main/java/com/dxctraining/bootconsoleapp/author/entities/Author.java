package com.dxctraining.bootconsoleapp.author.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author_details")
public class Author {

	@Id
	@GeneratedValue
	private int id;
	private String name;

	public Author() {}
	
	public Author(String name) {
		this.setName(name);
		this.setId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int hashCode() {
		return id;
	}

	public boolean equals(Object arg) {
		if (this == arg) {
			return true;
		} else if ((null == arg) || !(arg instanceof Author)) {
			return false;
		}
		Author that = (Author) arg;
		boolean isequals = this.id == that.id;
		return isequals;
	}
}
