package com.dxctraining.bootconsoleapp.author.dao;

import com.dxctraining.bootconsoleapp.author.entities.Author;

public interface IAuthorDao {

	Author remove(int id);

	Author update(Author author);

	Author save(Author author);

	Author findAuthorById(int id);

	Author findAuthorByName(String aname);

}
