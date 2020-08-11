package org.dxctraining.authormgt.service;

import org.dxctraining.authormgt.dao.*;
import org.dxctraining.authormgt.entities.*;
import org.dxctraining.authormgt.exception.InvalidArgumentException;

import java.util.*;

public class AuthorServiceImpl implements IAuthorService {

	private IAuthorDao dao = new AuthorDaoImpl();

	@Override
	public void add(Author author) {
		dao.add(author);
	}

	@Override
	public void remove(String id) {
		validateId(id);
		dao.remove(id);
	}

	@Override
	public Author updateName(String id, String name) {
		validateId(id);
		validateName(name);
		return null;
	}

	@Override
	public Author findById(String id) {
		validateId(id);
		Author author = dao.findById(id);
		return author;
	}
@Override
	public List<Author> findAll() {
		List<Author> list = dao.findAll();
		return list;
	}

	public void validateName(String name) {
		if (name==null || name.isEmpty()) {
			throw new InvalidArgumentException("Name cannot be empty");
		}
	}

	public void validateId(String id) {
		if (id==null || id.isEmpty()) {
			throw new InvalidArgumentException("Id cannot be null");
		}

	}
}