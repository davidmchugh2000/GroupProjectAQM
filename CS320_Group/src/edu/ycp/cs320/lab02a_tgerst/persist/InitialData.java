package edu.ycp.cs320.lab02a_tgerst.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.ycp.cs320.lab02a_tgerst.model.Admin;
import edu.ycp.cs320.lab02a_tgerst.model.Data;


public class InitialData {
	
	// reads initial Admin data from CSV file and returns a List of Admins
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
		
		
		// reads initial Book data from CSV file and returns a List of Books
		public static List<Data> getData() throws IOException {
			List<Data> dataList = new ArrayList<Data>();
			ReadCSV readData = new ReadCSV("data.csv");
			try {
				// auto-generated primary key for table books
				Integer dataID = 1;
				while (true) {
					List<String> tuple = readData.next();
					if (tuple == null) {
						break;
					}
					Iterator<String> i = tuple.iterator();
					Data data = new Data();
					
					// read book ID from CSV file, but don't use it
					// it's there for reference purposes, just make sure that it is correct
					// when setting up the BookAuthors CSV file
					// auto-generate book ID, instead
					Integer.parseInt(i.next());
					//skip over data_id
					data.setDataID(dataID++);
					data.setTime(i.next());
					data.setPercentHumidity(Float.parseFloat(i.next()));
					data.setTemperature(Float.parseFloat(i.next()));
					data.setAirPressure(Float.parseFloat(i.next()));
					data.setVOC(Float.parseFloat(i.next()));
					data.setModuleID(Integer.parseInt(i.next()));
					dataList.add(data);
				}
				System.out.println("dataList loaded from CSV file");			
				return dataList;
			} finally {
				readData.close();
			}
		}
		
		// reads initial BookAuthor data from CSV file and returns a List of BookAuthors
		/*public static List<BookAuthor> getBookAuthors() throws IOException {
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