package org.dxctraining.authormgt.service;

import org.dxctraining.authormgt.dao.*;
import org.dxctraining.authormgt.entities.*;
import java.util.*;

public class AuthorServiceImpl implements IAuthorService {

		public IAuthorDao dao=new AuthorDaoImpl();

		@Override
		public void add(Author author) {
			dao.add(author);
		}

		@Override
		public void remove(String id) {
			dao.remove(id);
		}

		@Override
		public Author updateName(String id, String name) {
			Author author=findById(id);
			dao.updateName(id, name);
			return author;
		}

		@Override
		public Author findById(String id) {
			Author author= dao.findById(id);
			return author;
		}

		@Override
		public List<Author> findAll() {
			List<Author>list=dao.findAll();
			return list;
		}
		
		
		
		
		
		
}
