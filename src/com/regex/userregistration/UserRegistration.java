package com.regex.userregistration;

import java.util.Scanner;

/**
 * Ability to ask user details
 * Calling validation to check for user input 
 * @author sheetal
 * @since 2021-08-26
 */
public class UserRegistration {
	//object
	static Details details = new Details();
	static Scanner scanner = new Scanner(System.in);
	
 	/**
 	 * Ability to ask user for his first name
 	 * Validates the user input by calling method
 	 */
 	public void userFirstName() {
		System.out.println("Enter the First Name :");
		details.setFirstName(scanner.next());
		Validater.CheckFirstname(details);
	}
 	
 	/**
 	 * Ability to ask user for his last name
 	 * Validates the user input by calling method
 	 */
	public void userLastName() {
		System.out.println("\nEnter the Last Name :");
		details.setLastName(scanner.next());
		Validater.CheckLastname(details);
	}

}
