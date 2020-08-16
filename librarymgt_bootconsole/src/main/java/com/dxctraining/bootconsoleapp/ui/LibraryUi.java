package com.dxctraining.bootconsoleapp.ui;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.bootconsoleapp.author.entities.*;
import com.dxctraining.bootconsoleapp.author.service.*;
import com.dxctraining.bootconsoleapp.book.entities.*;
import com.dxctraining.bootconsoleapp.book.service.*;
import com.dxctraining.bootconsoleapp.exception.*;

@Component
public class LibraryUi {

	@Autowired
	private IAuthorService authorService;
	@Autowired
	private IBookService bookService;

	@PostConstruct
	public void runUi() {
		try {
			Author author1 = new Author("John");
			author1 = authorService.save(author1);
			Book book1 = new Book("Life Style", author1);
			bookService.save(book1);
			int id1 = book1.getId();
			Book book2 = new Book("Complete refernce", author1);
			bookService.save(book2);
			int id2 = book2.getId();

			Author author2 = new Author("Samuel");
			author2 = authorService.save(author2);
			Book book3 = new Book("Python for Beginners", author2);
			bookService.save(book3);
			int id3 = book3.getId();
			Book book4 = new Book("Human Mind", author2);
			bookService.save(book4);
			int id4 = book4.getId();
			

			/*
			 * Author author3 = new Author("Ram"); 
			 * Author author4 = new Author("Dev");
			 * authorService.save(author3); 
			 * authorService.save(author4);

			  EngineeringBook engineerBook = new EngineeringBook("Eng.Book", "EF4",author3, "IC Engine", "Fluid Mechanics");
			  ProgrammingBook programBook = new ProgrammingBook("IT book", "LG5", author4, "Complete reference", 2.2);
			  bookService.add(engineerBook); 
			  bookService.add(programBook);
			 */

		} catch (InvalidArgumentException e) {
			e.printStackTrace();
		} catch (BookNotFoundException e) {
			e.printStackTrace();
		} catch (AuthorNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void display(Book book) {
		Book bookList = bookService.findBookById(1);
		System.out.println("-----Book Details------");
		System.out.println("Name of the book : " + book.getName() + ". Book id: " + book.getId());

		Author authorList = authorService.findAuthorByName("John");
		System.out.println("-----Author Details------");
		Author author = book.getAuthor();
		System.out.println("Author of the book is " + author.getName() + ". Author Id: " + author.getId());
	}
	/*
	  if (book instanceof EngineeringBook) { 
	  EngineeringBook engBook = (EngineeringBook) book; 
	  System.out.println("IC Engine is an Automobile book "+ engBook.getAutoBook() + "Fluid Mechanics is a Mechanical book " + engBook.getMechBook()); 
	  }
	   if (book instanceof ProgrammingBook) {
	  ProgrammingBook progBook = (ProgrammingBook) book; 
	  System.out.println("Complete refernce is Java" + progBook.getLanguage() + "Version is " +progBook.getVersion()); 
	  }
	  
	 */

}
