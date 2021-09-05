package com.userRegistration.lambdaExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Phone{
	//Method to check validation for password
    void PhoneValidate();
}

public class UserRegistrationPassword {
	public static void main(String[] args) {
		// Lambda -> operator uses
		Phone phone = () -> {
			Scanner sc = new Scanner(System.in);

			String regex = "^[A-Z]{1}+[a-zA-z1-9]{5,}[@$^]{1}[1-9]{1}$";
			;

			System.out.println("Enter your Password");
			String mobile = sc.next();

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(mobile);
			if (matcher.matches()) {
				System.out.println("Given Password is valid");
			} else {
				System.out.println("Given Password.is not valid");
			}
		};
		phone.PhoneValidate();

	}
}
