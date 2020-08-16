package com.dxctraining.bootconsoleapp.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.bootconsoleapp.book.dao.*;
import com.dxctraining.bootconsoleapp.book.entities.*;
import com.dxctraining.bootconsoleapp.exception.*;

@Transactional
@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookDao bookDao;

	@Override
	public Book remove(int id) {
		validate(id);
		Book book = remove(id);
		bookDao.remove(id);
		return book;
	}

	@Override
	public Book update(Book book) {
		validate(book);
		bookDao.update(book);
		return book;
	}

	@Override
	public Book save(Book book) {
		validate(book);
		bookDao.save(book);
		return book;
	}

	@Override
	public Book findBookById(int id) {
		validate(id);
		Book book = bookDao.findBookById(id);
		return book;
	}

	@Override
	public Book findBookByName(String bname) {
		Book book = bookDao.findBookByName(bname);
		return book;
	}

	@Override
	public void validate(Book book) {
		if (book == null) {
			throw new BookNotFoundException("Book not found");
		}
	}

	@Override
	public void validate(int id) {
		if (id == 0) {
			throw new InvalidArgumentException("Id not found");
		}

	}

}
