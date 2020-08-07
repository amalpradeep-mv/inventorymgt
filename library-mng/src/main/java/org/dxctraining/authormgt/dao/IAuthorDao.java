package org.dxctraining.authormgt.dao;

import java.util.List;

import org.dxctraining.authormgt.entities.*;

public interface IAuthorDao {
	
	void add(Author author);

	void remove(String id);

	Author updateName(String id, String name);

	Author findById(String id);

	List<Author> findAll();
	

}
