package org.dxctraining.bookmgt.service;

import java.util.List;

import org.dxctraining.bookmgt.dao.*;
import org.dxctraining.bookmgt.entities.*;

public class BookServiceImpl implements IBookService {

	public IBookDao dao = new BookDaoImpl();

	@Override
	public void add(Book book) {
		dao.add(book);

	}

	@Override
	public void remove(String id) {
		dao.remove(id);
	}

	@Override
	public Book updateName(String id, String name) {
		Book book = dao.findById(id);
		dao.updateBook(id, name);
		return book;
	}

	@Override
	public Book findById(String id) {
		Book book = dao.findById(id);
		return book;
	}

	@Override
	public List<Book> findAll() {
		List<Book>list=dao.findAll();
		return list;
	}

}
