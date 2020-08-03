package org.dxctraining.authormgt.service;

import java.util.List;

import org.dxctraining.authormgt.entities.*;

public interface IAuthorService {

	void add(Author author);

	void remove(String id);

	Author updateName(String id, String name);

	Author findById(String id);

	List<Author> findAll();
	
}
