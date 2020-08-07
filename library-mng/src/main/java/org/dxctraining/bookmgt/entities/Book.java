package org.dxctraining.bookmgt.entities;

import org.dxctraining.authormgt.entities.Author;

public class Book {

	private String id;
	private String name;
	private Author author;

	public Book(String name, String id, Author author) {
		this.name = name;
		this.id = id;
		this.author = author;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	public int hashCode() {
		int hashCode=id.hashCode();
		return hashCode;
	}
	public boolean equals(Object arg) {
		if(this== arg) {
			return true;
		} else if((null == arg) || !(arg instanceof Book)) {
			return false;
		}
		Book that=(Book) arg;
		boolean isequals=this.id.equals(that.id);
		return isequals;
	}
}
