package edu.ycp.cs320.lab02a_tgerst.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.ycp.cs320.lab02a_tgerst.model.Admin;


public class InitialData {
	
	// reads initial Author data from CSV file and returns a List of Authors
		public static List<Admin> getAdmins() throws IOException {
			List<Admin> adminList = new ArrayList<Admin>();
			ReadCSV readAdmins = new ReadCSV("account.csv");
			try {
				// auto-generated primary key for authors table
				while (true) {
					List<String> tuple = readAdmins.next();
					if (tuple == null) {
						break;
					}
					Iterator<String> i = tuple.iterator();
					Admin admin = new Admin();

					// read author ID from CSV file, but don't use it
					// it's there for reference purposes, just make sure that it is correct
					// when setting up the BookAuthors CSV file				
					// auto-generate author ID, instead
					admin.setUsername(i.next());	
					admin.setPassword(i.next());
					admin.setEmail(i.next());
					adminList.add(admin);
				}
				System.out.println("adminList loaded from CSV file");
				return adminList;
			} finally {
				readAdmins.close();
			}
		}
		
		/*
		// reads initial Book data from CSV file and returns a List of Books
		public static List<Book> getBooks() throws IOException {
			List<Book> bookList = new ArrayList<Book>();
			ReadCSV readBooks = new ReadCSV("books.csv");
			try {
				// auto-generated primary key for table books
				Integer bookId = 1;
				while (true) {
					List<String> tuple = readBooks.next();
					if (tuple == null) {
						break;
					}
					Iterator<String> i = tuple.iterator();
					Book book = new Book();
					
					// read book ID from CSV file, but don't use it
					// it's there for reference purposes, just make sure that it is correct
					// when setting up the BookAuthors CSV file
					Integer.parseInt(i.next());
					// auto-generate book ID, instead
					book.setBookId(bookId++);				
//					book.setAuthorId(Integer.parseInt(i.next()));  // no longer in books table
					book.setTitle(i.next());
					book.setIsbn(i.next());
					book.setPublished(Integer.parseInt(i.next()));
					
					bookList.add(book);
				}
				System.out.println("bookList loaded from CSV file");			
				return bookList;
			} finally {
				readBooks.close();
			}
		}
		
		// reads initial BookAuthor data from CSV file and returns a List of BookAuthors
		public static List<BookAuthor> getBookAuthors() throws IOException {
			List<BookAuthor> bookAuthorList = new ArrayList<BookAuthor>();
			ReadCSV readBookAuthors = new ReadCSV("book_authors.csv");
			try {
				while (true) {
					List<String> tuple = readBookAuthors.next();
					if (tuple == null) {
						break;
					}
					Iterator<String> i = tuple.iterator();
					BookAuthor bookAuthor = new BookAuthor();
					bookAuthor.setBookId(Integer.parseInt(i.next()));				
					bookAuthor.setAuthorId(Integer.parseInt(i.next()));
					bookAuthorList.add(bookAuthor);
				}
				System.out.println("bookAuthorList loaded from CSV file");			
				return bookAuthorList;
			} finally {
				readBookAuthors.close();
			}
		}
		*/
}