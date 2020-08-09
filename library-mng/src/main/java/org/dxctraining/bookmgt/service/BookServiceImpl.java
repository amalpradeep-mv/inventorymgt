package org.dxctraining.bookmgt.service;

import java.util.List;

import org.dxctraining.bookmgt.dao.*;
import org.dxctraining.bookmgt.entities.*;
import org.dxctraining.bookmgt.exception.InvalidArgumentException;

public class BookServiceImpl implements IBookService {

	private IBookDao dao = new BookDaoImpl();

	@Override
	public void add(Book book) {
		dao.add(book);

	}

	@Override
	public void remove(String id) {
		validateId(id);
		dao.remove(id);
	}

	@Override
	public Book updateName(String id, String name) {
		validateId(id);
		validateName(name);
		return null;
	}

	@Override
	public Book findById(String id) {
		validateId(id);
		Book book = dao.findById(id);
		return book;
	}

	@Override
	public List<Book> findAll() {
		List<Book> list = dao.findAll();
		return list;
	}

	public void validateName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidArgumentException(" Name cannot be empty");
		}
	}

	public void validateId(String id) {
		if (id == null || id.isEmpty()) {
			throw new InvalidArgumentException("Id cannot be empty");
		}
	}

}
