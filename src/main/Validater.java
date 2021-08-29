package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validates the user input with condition given
 * If it doesn't matches, asks user again to enter input
 * @author Sheetal
 * @since 2021-08-29
 */
public class Validater {

	/** Validates the First name with condition by calling method */
	public boolean checkName(String name) {
		String condition = "[A-Z]{1}[a-z]{2,}"; // Condition
		return validate(name, condition);
	}
	
	/** Validates the mail with condition by calling method */
	public boolean checkEmail(String Email) {
		String condition = "[a-z]+[0-9]*([.+-][a-zA-Z0-9]+){0,1}@[a-z0-9]+\\.[a-z]{2,3}(\\.[a-z]{2,3}){0,1}"; // Condition
		return validate(Email, condition);
	}
	
	/** Validates the Mobile Number with condition by calling method */
	public boolean checkMobileNumber(String mobile) {
		String condition = "[+]{0,1}[9][1][ -]{0,1}[6-9][0-9]{9}"; // Condition
		return validate(mobile, condition);
	}
	
	/** Validates the Password with condition by calling method */
	public boolean checkPassword(String password) {
		String condition = "^(?=.*[@#$%^&+=])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$"; // Condition
		return validate(password, condition);
	}
	
	/** Ability to validate the given String with the Condition and return true or false */
	public boolean validate(String string, String condition) {
		Pattern pattern = Pattern.compile(condition); // Assigning condition to compile
		Matcher matcher = pattern.matcher(string); // Checking for Matching
		boolean checker = matcher.matches(); // Matches result: True or False
		return checker;
	}
}
