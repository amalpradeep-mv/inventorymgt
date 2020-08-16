package com.dxctraining.bootconsoleapp.author.dao;

import com.dxctraining.bootconsoleapp.author.entities.Author;
import com.dxctraining.bootconsoleapp.exception.AuthorNotFoundException;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class AuthorDaoImpl implements IAuthorDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Author remove(int id) {
		Author author = findAuthorById(id);
		em.remove(author);
		return author;
	}

	@Override
	public Author update(Author author) {
		author = em.merge(author);
		return author;
	}

	@Override
	public Author save(Author author) {
		em.persist(author);
		return author;
	}

	@Override
	public Author findAuthorById(int id) {
		Author author = em.find(Author.class, id);
		if (author == null) {
			throw new AuthorNotFoundException("Author not found");
		}
		return author;
	}

	@Override
	public Author findAuthorByName(String aName) {
		String jpaQuery = "from Author where name=:aname";
		Query query = em.createQuery(jpaQuery);
		query.setParameter("ename", aName);
		List<Author> list = query.getResultList();
		Author author = null;
		if (!list.isEmpty()) {
			author = list.get(0);

		}
		return author;
	}
}