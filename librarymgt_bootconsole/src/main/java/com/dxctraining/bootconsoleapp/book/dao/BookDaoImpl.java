package com.dxctraining.bootconsoleapp.book.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.dxctraining.bootconsoleapp.book.entities.Book;
import com.dxctraining.bootconsoleapp.exception.*;

@Repository
public class BookDaoImpl implements IBookDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Book update(Book book) {
		book = em.merge(book);
		return book;
	}

	@Override
	public Book save(Book book) {
		em.persist(book);
		return book;
	}

	@Override
	public Book findBookById(int id) {
		Book book = em.find(Book.class, id);
		if (book == null) {
			throw new BookNotFoundException("Book not found");
		}
		return book;
	}

	@Override
	public Book findBookByName(String aName) {
		String jpaQuery = "from Book where name=:aname";
		Query query = em.createQuery(jpaQuery);
		query.setParameter("ename", aName);
		List<Book> list = query.getResultList();
		Book book = null;
		if (!list.isEmpty()) {
			book = list.get(0);
		}
		return book;
	}

	@Override
	public Book remove(int id) {
		Book book=remove(id);
		em.remove(id);
		return book;
	}

}
