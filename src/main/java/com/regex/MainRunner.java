package com.regex;

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
		
		UserRegistration userRegistration=new UserRegistration();//Object
		
		//Calling Methods
		userRegistration.userFirstName();
		userRegistration.userLastName();
		userRegistration.userPhoneNumber();
		userRegistration.userEmail();
		userRegistration.userPassword();
		
	}
}
