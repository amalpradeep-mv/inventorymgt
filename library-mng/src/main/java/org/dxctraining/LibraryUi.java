package org.dxctraining;

import org.dxctraining.authormgt.entities.*;
import org.dxctraining.authormgt.exception.*;
import org.dxctraining.authormgt.service.*;
import org.dxctraining.bookmgt.entities.*;
import org.dxctraining.bookmgt.exception.*;
import org.dxctraining.bookmgt.exception.InvalidArgumentException;
import org.dxctraining.bookmgt.service.*;
import java.util.*;

public class LibraryUi {

	public IAuthorService authorService = new AuthorServiceImpl();
	public IBookService bookService = new BookServiceImpl();

	public static void main(String args[]) {
		LibraryUi ui = new LibraryUi();
		ui.runUi();
	}

	public void runUi() {
		try {
			Author author1 = new Author("John", "AD1");
			Author author2 = new Author("Sam", "BE4");
			Author author3 = new Author("Ram", "GF4");
			Author author4 = new Author("Dev", "OT5");
			authorService.add(author1);
			authorService.add(author2);
			authorService.add(author3);
			authorService.add(author4);

			Book book1 = new Book("Life Style", "EDFGJ143", author1);
			bookService.add(book1);
			String id1 = book1.getId();
			Book book2 = new Book("Complete refernce", "HGDERN678", author2);
			bookService.add(book2);
			String id2 = book2.getId();

			EngineeringBook engineerBook = new EngineeringBook("Eng.Book", "4", author3, "IC Engine", "Fluid Mechanics");
			ProgrammingBook programBook = new ProgrammingBook("IT book", "5", author4, "Complete reference", 2.2);
		
		} 
		catch (InvalidArgumentException e) {
			e.printStackTrace();
		}
		catch (BookNotFoundException e) {
			e.printStackTrace();
		} 
		catch (AuthorNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void dispalyAll() {
		List<Book> bookList = bookService.findAll();
		for (Book book : bookList) {
			display(book);
		}
		List<Author> authorList = authorService.findAll();
		for (Author author : authorList) {
			display(author);
		}
	}

	public void display(Book book) {
		System.out.println("-----Book Details------");
		System.out.println("Name of the book : " + book.getName() + ". Book id: " + book.getId());

		Author author = book.getAuthor();
		System.out.println("Author of the book is " + author.getName() + ". Author Id: " + author.getId());

		if (book instanceof EngineeringBook) {
			EngineeringBook engBook = (EngineeringBook) book;
			System.out.println("IC Engine is an Automobile book " + engBook.getAutoBook()
					+ "Fluid Mechanics is a Mechanical book " + engBook.getMechBook());
		}
		if (book instanceof ProgrammingBook) {
			ProgrammingBook progBook = (ProgrammingBook) book;
			System.out.println("Complete refernce is a ");
		}
	}

	public void display(Author author) {
		System.out.println("-----Author Details------");
		System.out.println("Name of the Author : " + author.getName() + ". Author id: " + author.getId());

	}

}
