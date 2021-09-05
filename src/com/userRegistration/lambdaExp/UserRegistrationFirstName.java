package com.userRegistration.lambdaExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface FirstName {
  void firstNameValidate();
}

public class UserRegistrationFirstName {
	public static void main(String[] args) {
		// Lambda -> operator uses for first name
		FirstName fName = () -> {
			Scanner sc = new Scanner(System.in);
			// Regex pattern for FirstName
			String regex = "^[A-Z]{1}[a-z]{3,20}$";
			// user input
			System.out.println("Enter your name");
			String name = sc.next();

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(name);
			if (matcher.matches()) {
				System.out.println("Entered name id is valid");
			} else {
				System.out.println("Entered name id is not valid");
			}
		};
		fName.firstNameValidate();

	}
}
