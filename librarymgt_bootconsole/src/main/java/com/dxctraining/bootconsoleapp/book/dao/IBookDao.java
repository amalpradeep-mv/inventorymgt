package com.dxctraining.bootconsoleapp.book.dao;

import com.dxctraining.bootconsoleapp.book.entities.Book;

public interface IBookDao {

	Book update(Book book);

	Book save(Book book);

	Book findBookById(int id);

	Book findBookByName(String aName);

	Book remove(int id);
}
