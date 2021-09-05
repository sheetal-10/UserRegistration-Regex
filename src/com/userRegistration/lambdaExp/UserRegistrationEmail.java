package com.userRegistration.lambdaExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface User{
	//Method to check validation for Email
    void emailValidate();
}

public class UserRegistrationEmail {
	 public static void main(String[] args ){
	        //Lambda -> operator 
	        User user = () -> {
	            Scanner sc = new Scanner(System.in);
	            
	            //Regex pattern for LasttName
	            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	            
	            System.out.println("Enter your Email id");
	            String email = sc.next();

	            Pattern pattern = Pattern.compile(regex);
	            Matcher matcher = pattern.matcher(email);
	            if(matcher.matches()){
	                System.out.println("Given email id is valid");
	            }else{
	                System.out.println("Given email id is not valid");
	            }
	        };
	        user.emailValidate();

	    }
}
