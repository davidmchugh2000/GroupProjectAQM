package edu.ycp.cs320.lab02a_tgerst.controller;


import edu.ycp.cs320.lab02a_tgerst.persist.DatabaseProvider;
import edu.ycp.cs320.lab02a_tgerst.persist.DerbyDatabase;
import edu.ycp.cs320.lab02a_tgerst.persist.IDatabase;

import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.lab02a_tgerst.model.Module;

public class ModuleController {
	//create a Numbers model
	private Module model;
	
	private IDatabase db    = null;

	public ModuleController() {
		// creating DB instance here
		DatabaseProvider.setInstance(new DerbyDatabase());
		db = DatabaseProvider.getInstance();		
	}
	
	/*public ArrayList<Module> getModuleData(String lastName) {
		
		// get the list of (Author, Book) pairs from DB
		List<Pair<Author, Book>> authorBookList = db.findAuthorAndBookByAuthorLastName(lastName);
		ArrayList<Book> books = null;
		
		if (authorBookList.isEmpty()) {
			System.out.println("No books found for author <" + lastName + ">");
			return null;
		}
		else {
			books = new ArrayList<Book>();
			for (Pair<Author, Book> authorBook : authorBookList) {
				Author author = authorBook.getLeft();
				Book book = authorBook.getRight();
				books.add(book);
				System.out.println(author.getLastname() + "," + author.getFirstname() + "," + book.getTitle() + "," + book.getIsbn() + ", " + book.getPublished());
			}			
		}
		
		// return of books for this author
		return books;
	}*/
	
}
