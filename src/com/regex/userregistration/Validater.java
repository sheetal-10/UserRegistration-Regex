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
}
