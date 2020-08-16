package com.dxctraining.bootconsoleapp.book.service;

import com.dxctraining.bootconsoleapp.book.entities.Book;

public interface IBookService {

	void validate(Book book);

	void validate(int id);
	
	Book remove(int id);

	Book update(Book book);

	Book save(Book book);
	
	Book findBookById(int id);
	
	Book findBookByName(String bname);
}
