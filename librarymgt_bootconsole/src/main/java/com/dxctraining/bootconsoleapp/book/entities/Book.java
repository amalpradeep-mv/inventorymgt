package com.dxctraining.bootconsoleapp.book.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.dxctraining.bootconsoleapp.author.entities.Author;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Author author;

	public Book(String name, Author author) {
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		return id;
	}

	public boolean equals(Object arg) {
		if (this == arg) {
			return true;
		} else if ((null == arg) || !(arg instanceof Book)) {
			return false;
		}
		Book that = (Book) arg;
		boolean isequals = this.id == that.id;
		return isequals;
	}
}
