package org.dxctraining.authormgt.dao;

import org.dxctraining.authormgt.entities.*;
import org.dxctraining.authormgt.exception.*;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AuthorDaoImpl implements IAuthorDao {

	private Map<String, Author> info = new HashMap<>();

	private int generateId;

	String generateId() {
		generateId++;
		String idStr = "" + generateId();
		return idStr;
	}

	@Override
	public void add(Author author) {
		String id = generateId();
		info.put(id, author);
		author.setId(id);
	}

	@Override
	public void remove(String id) {
		info.remove(id);

	}

	@Override
	public Author updateName(String id, String name) {
		Author author = findById(id);
		author.setName(name);
		return author;
	}

	@Override
	public Author findById(String id) {
		boolean exists = info.containsKey(id);
		if (!exists) {
			throw new AuthorNotFoundException("Author doesn't exists" + id);
		}
		Author author = info.get(id);
		return author;
	}

	@Override
	public List<Author> findAll() {
		Collection<Author> collection = info.values();
		List<Author> list = new ArrayList<>();
		for (Author author : collection) {
			list.add(author);
		}
		return list;
	}

}
