package com.userRegistration.lambdaExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Email{
	//Method to check validation for phone no
    void mobilelValidate();
}

public class UserRegistrationMobile {
	 public static void main(String[] args ){
	        //Lambda -> operator uses
	        Email email = () -> {
	            Scanner sc = new Scanner(System.in);

	            String regex = "^(91){1}[0-9]{10}$";

	            System.out.println("Enter your Mobile number");
	            String mobile = sc.next();

	            Pattern pattern = Pattern.compile(regex);
	            Matcher matcher = pattern.matcher(mobile);
	            if(matcher.matches()){
	                System.out.println("Given mobile number is valid");
	            }else{
	                System.out.println("Given mobile number. is not valid");
	            }
	        };
	       email.mobilelValidate();

	    }
}
