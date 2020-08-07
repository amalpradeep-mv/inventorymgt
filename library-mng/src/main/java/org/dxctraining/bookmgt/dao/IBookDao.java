package org.dxctraining.bookmgt.dao;

import java.util.List;

import org.dxctraining.bookmgt.entities.*;

public interface IBookDao {

	void add(Book book);

	void remove(String id);

	Book updateBook(String id, String name);

	Book findById(String id);

	List<Book> findAll();
}
