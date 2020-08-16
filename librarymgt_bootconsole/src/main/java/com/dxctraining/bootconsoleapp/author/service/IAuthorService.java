package com.dxctraining.bootconsoleapp.author.service;

import com.dxctraining.bootconsoleapp.author.entities.Author;

public interface IAuthorService {

	Author update(Author author);

	Author save(Author author);

	Author findAuthorById(int id);

	Author findAuthorByName(String aname);

	void remove(int id);

	void validate(Author author);

	void validate(int id);
}
