package com.chainsys.methods;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class LoginPage {

	public static void main(String[] args) {
	String username1="^[a-zA-Z0-9]{1,8}$";
	String email="^[a-z0-9]+[a-z0-9\\.]+@[a-z\\.]+[a-z]{3,}$";
	String password="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$";
	
	Pattern inputname1=Pattern.compile(username1);
	Pattern inputemail=Pattern.compile(email);
	Pattern inputword=Pattern.compile(password);
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the user using lowercase,uppercase and interger 1 to 8");
		String name1=sc.next();
		while(!(inputname1.matcher(name1).matches())){
			System.out.println("invalid ");
			System.out.println("ENTER THE NAME: ");
		    name1=sc.next();
		}
	System.out.println("Enter the email Id using lower case,uppercase  and interger 5 to 20");
		String email1=sc.next();
		while(!(inputemail.matcher(email1).matches())) {
			System.out.println("invalid ");
			System.out.println("Enter the email:");
			email1=sc.next();
		}
	System.out.println("Enter the password using atleast one lower,one upper case with one special character:");
		String password1=sc.next();		
		while(!(inputword.matcher(password).matches())) {
			System.out.println("invalid ");
			System.out.println("enter the password: ");
		}
		
		Matcher usernamematcher= inputname1.matcher(name1);
		Matcher inputmatcher=inputemail.matcher(email1);
		Matcher passwordmatcher=inputword.matcher(password1);
		
		if(usernamematcher.matches() && inputmatcher.matches() && passwordmatcher.matches() ) {
			System.out.println("Login succesful");
		}
		else {
			System.out.println("invalid");
		}
		
		sc.close();
		}
	

	}


