package com.dxctraining.bootconsoleapp.author.service;

import com.dxctraining.bootconsoleapp.author.dao.*;
import com.dxctraining.bootconsoleapp.author.entities.Author;
import com.dxctraining.bootconsoleapp.exception.InvalidArgumentException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AuthorServiceImpl implements IAuthorService {

	@Autowired
	private IAuthorDao authorDao;

	@Override
	public void validate(Author author) {
		if (author == null) {
			throw new InvalidArgumentException("Name cannot be empty");
		}
	}

	@Override
	public void validate(int id) {
		if (id == 0) {
			throw new InvalidArgumentException("Id cannot be null");
		}
	}

	@Override
	public Author update(Author author) {
		validate(author);
		authorDao.update(author);
		return author;
	}

	@Override
	public Author save(Author author) {
		validate(author);
		authorDao.save(author);
		return author;
	}

	@Override
	public Author findAuthorById(int id) {
		validate(id);
		Author author = authorDao.findAuthorById(id);
		return author;
	}

	@Override
	public Author findAuthorByName(String aname) {
		Author author = authorDao.findAuthorByName(aname);
		return author;

	}

	@Override
	public void remove(int id) {
		validate(id);
		authorDao.remove(id);
	}

}