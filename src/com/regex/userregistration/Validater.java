package com.regex.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validates the user input with condition given
 * If it doesn't matches, asks user again to enter input
 * @author sheetal
 * @since 2021-08-26
 */
public class Validater {
	//object
	static UserRegistration userRegistration = new UserRegistration();

	/**
	 * Ability to validate the user FirstName with the condition Condition: Min. of
	 * 3 characters and First letter should be Capital If it doesn't matches, asks
	 * user again to enter the name by calling method 
	 * @param details
	 */
	public static void CheckFirstname(Details details) {
		String check = "^[A-Z]{1}[a-z]{2,}$"; // Condition
		Pattern pattern = Pattern.compile(check); // Assigning condition to compile
		Matcher matcher = pattern.matcher(details.getFirstName()); // Checking for Matching
		boolean result = matcher.matches(); // Matches result: True or False
		if (result) {
			System.out.println("First Name '" + details.getFirstName() + "' is Valid and Saved to details");
		} else {
			System.out.println("\nInvalid First Name.\nUse min. of 3 characters and First letter should be Capital\n");
			userRegistration.userFirstName(); // calling the method to ask user
		}
	}
	
	/**
	 * Ability to validate the user LastName with the condition
	 * Condition: Min. of 3 characters and First letter should be Capital
	 * If it doesn't matches, asks user again to enter the name by calling method
	 * @param details
	 */
	public static void CheckLastname(Details details) {
		String check = "^[A-Z]{1}[a-z]{2,}$"; // Condition
		Pattern pattern = Pattern.compile(check); // Assigning condition to compile
		Matcher matcher = pattern.matcher(details.getLastName()); // Checking for Matching
		boolean result = matcher.matches(); // Match result: True or False
		if (result) {
			System.out.println("Last Name '" + details.getLastName() + "' is Valid and Saved to details");
		} else {
			System.out.println("\nInvalid Last Name.\nUse min. of 3 characters and First letter should be Capital");
			userRegistration.userLastName(); // calling the method to ask user
		}
	}
	
	/**
	 * Ability to validate the user E-mail with the conditions
	 * Condition: 1) Email has 3 mandatory parts (user name, @ , domain name)
	 * Condition: 2) user name must have min. of 3 character and optional of '.' with 3 characters
	 * Condition: 3) Domain name must have '@' and then characters of 2-3 and then '.' with 2-3 characters
	 * Condition: 4) Domain name may contains extra 2-3 characters starting with '.' again
	 * If it doesn't matches, asks user again to enter the E-mail by calling method
	 * @param details
	 */
	public static void CheckEmail(Details details ) { 
		String check="^[a-z]+(\\.[a-zA-Z0-9]+)*@[a-z]{2,}\\.[a-z]{2,3}(\\.[a-z]{2,3})*$"; //Condition
		Pattern pattern = Pattern.compile(check); //Assigning condition to compile
		Matcher matcher = pattern.matcher(details.getEmail()); //Checking for Matching
		boolean result = matcher.matches(); // Match result: True or False
		if (result) {
			System.out.println("E-mail: '"+details.getEmail()+"' is Valid and Saved to details");
		} else {
			System.out.println("\nInvalid E-mail.\nE-mail is of like abc.xyz@bl.co.in");
			userRegistration.userEmail(); //calling the method to ask user
		}
	}
	
	/**
	 * Ability to validate the user Phone Number with the condition
	 * Condition: Country code followed by 10 digit number
	 * If it doesn't matches, asks user again to enter the number by calling method
	 * @param details
	 */
	public static void CheckPhoneNumber(Details details ) { 
		String check="^[9][1][6-9][0-9]{9}$";
		Pattern pattern = Pattern.compile(check); //Assigning condition to compile
		Matcher matcher = pattern.matcher(details.getPhoneNumber()); //Checking for Matching
		boolean result = matcher.matches(); // Match result: True or False
		if (result) {
			System.out.println("Phone Number '"+details.getPhoneNumber()+"' is Valid and Saved to details");
		} else {
			System.out.println("\nInvalid Phone Number.\nMobile Number is of like Country code followed by 10 digit number");
			userRegistration.userPhoneNumber(); //calling the method to ask user
		}
	}
	
	/**
	 * Ability to validate the user Password with the condition
	 * Condition: 1) Password should be min. of 8 characters
	 * Condition: 2) Must have at least one Upper Case
	 * Condition: 3) Must have at least one Number
	 * If it doesn't matches, asks user again to enter the password by calling method
	 * @param details
	 */
	public static void CheckPassword(Details details ) { 
		String check="^(?=.*[@#$%^&+=])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$"; //Condition
		Pattern pattern = Pattern.compile(check); //Assigning condition to compile
		Matcher matcher = pattern.matcher(details.getPassword()); //Checking for Matching
		boolean result = matcher.matches(); // Match result: True or False
		if (result) {
			System.out.println("Password '"+details.getPassword()+"' is Valid and Saved to details");
		} else {
			System.out.println("\nInvalid Password.\nUse 8 or more characters with a mix of atleast one Upper case,\none number and one special character");
			userRegistration.userPassword(); //calling the method to ask user
		}
	}
}
