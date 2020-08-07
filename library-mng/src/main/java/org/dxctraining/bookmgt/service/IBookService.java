package org.dxctraining.bookmgt.service;

import java.util.List;

import org.dxctraining.bookmgt.entities.Book;

public interface IBookService {

	void add(Book book);

	void remove(String id);

	Book updateName(String id, String name);

	Book findById(String id);

	List<Book> findAll();
}
