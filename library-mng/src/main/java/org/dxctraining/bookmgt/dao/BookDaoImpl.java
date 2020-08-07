package org.dxctraining.bookmgt.dao;

import org.dxctraining.bookmgt.exception.*;
import org.dxctraining.bookmgt.entities.*;

import java.util.*;

public class BookDaoImpl implements IBookDao {
	
	private Map<String, Book> store = new HashMap<>();

	private int generatedId;

	String generateId() {
		generatedId++;
		String isStr = "" + generateId();
		return isStr;
	}

	@Override
	public Book findById(String id) {
		boolean exists = store.containsKey(id);
		if (!exists) {
			throw new BookNotFoundException("Book doesn't exists" + id);
		}
		Book book = store.get(id);
		return book;
	}

	@Override
	public List<Book> findAll() {
		Collection<Book> collection = store.values();
		List<Book> list = new ArrayList();
		for (Book book : collection) {
			list.add(book);
		}
		return list;
	}

	@Override
	public void add(Book book) {
		String id = generateId();
		store.put(id, book);
		book.getId();
	}

	@Override
	public void remove(String id) {
		store.remove(id);
	}

	@Override
	public Book updateBook(String id, String name) {
		Book book = findById(id);
		book.setName(name);
		return book;
	}
}
