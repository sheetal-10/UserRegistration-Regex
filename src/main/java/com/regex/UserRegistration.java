package com.regex;

import java.util.Scanner;

/**
 * Ability to ask user details
 * Calling validation to check for user input 
 * @author sheetal
 * @since 2021-09-02
 */
public class UserRegistration {
		// Objects
		static Scanner scanner = new Scanner(System.in);
		static Validater validate = new Validater();

		/** Ability to ask user for his first name and Checks it */
		public void userFirstName() {
			System.out.println("\nEnter the First Name:");
			boolean result = validate.checkName(scanner.nextLine());
			output(result);
			if (result == false) userFirstName();
		}

		/** Ability to ask user for his last name and Checks it */
		public void userLastName() {
			System.out.println("\nEnter the Last Name:");
			boolean result = validate.checkName(scanner.nextLine());
			output(result);
			if (result == false) userLastName();
		}

		/** Ability to ask user for his E-mail and checks it */
		public void userEmail() {
			System.out.println("\nEnter the E-mail :");
			boolean result = validate.checkEmail(scanner.nextLine());
			output(result);
			if (result == false) userEmail();
		}
		
		/** Ability to ask user for his Phone Number and checks it */
		public void userPhoneNumber() {
			System.out.println("\nEnter the Phone Number :");
			boolean result = validate.checkMobileNumber(scanner.nextLine());
			output(result);
			if (result == false) userPhoneNumber();
		}
		
		/** Ability to ask user for new Password and check it */
		public void userPassword() {
			System.out.println("\nEnter the Password :");
			boolean result = validate.checkPassword(scanner.nextLine());
			output(result);
			if (result == false) userPassword();
		}
		/** Ability to print valid or not based on result */
		public void output(boolean result) {
			try {
				if (result) System.out.println("Valid Input");
				else throw new userException("Invalid Input");
			} catch (userException | NullPointerException e) {
				System.out.println(e.getMessage());
			}
		}
}