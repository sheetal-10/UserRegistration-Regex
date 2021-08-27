package com.regex.userregistration;

/**
 * This is Main function
 * Calling methods to get user input for registration and validate
 * @author sheetal
 * @since 2021-08-26
 */
public class MainRunner {
		public static void main(String[] args) {
			//Welcome Message
			System.out.println("Program for the User Registration and Validation");
			
			//Object
			UserRegistration userRegistration=new UserRegistration();
			
			//Calling Methods
			userRegistration.userFirstName();
			userRegistration.userLastName();
	}
}
