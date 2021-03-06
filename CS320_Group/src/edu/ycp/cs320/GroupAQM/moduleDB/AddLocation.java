package edu.ycp.cs320.GroupAQM.moduleDB;

import java.util.Scanner;


import edu.ycp.cs320.GroupAQM.persist.DatabaseProvider;
import edu.ycp.cs320.GroupAQM.persist.DerbyDatabase;
import edu.ycp.cs320.GroupAQM.persist.IDatabase;
import edu.ycp.cs320.GroupAQM.persist.InitDatabase;

public class AddLocation{
	public static void main(String[] args) throws Exception {
		
		Scanner keyboard = new Scanner(System.in);

		// Create the default IDatabase instance
		
		InitDatabase.init(keyboard);
		
		System.out.print("Enter cooridnates: ");
		String coordinates = keyboard.nextLine();
		
		System.out.print("Enter city: ");
		String city = keyboard.nextLine();
		
		System.out.print("Enter state: ");
		String state = keyboard.nextLine();
		
		System.out.print("Enter country: ");
		String country = keyboard.nextLine();
		
		// get the DB instance and execute transaction
		IDatabase db = DatabaseProvider.getInstance();
		int location_id = db.addLocation(coordinates, city, state, country);
		
		// check if anything was returned and output the list
		if (location_id > 0) {
			System.out.println("The location you entered has been added to the database with the Location ID of " + location_id);
		}
		else {
				System.out.println("Failed to enter location");	
		}
	}
}