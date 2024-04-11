package com.chainsys.cabfare;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CabName {

	public static void main(String[] args) {
		System.out.println("--------------------------------");
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter user name");
	        String userName = sc.next();
	        
	        System.out.println("--------------------------------");
	        
	        System.out.println("enter your distance in kilometer");
	        double km =sc.nextDouble();
	        // validation
	        if(km<0) {
	        	System.out.println("Input Error");
	        	System.out.println("Enter the input in Poisitve Integer");
	        km=sc.nextDouble(); 	
	        }
	        System.out.println("------------------------------");
	        
	        System.out.println("choose your cab type (micro // mini // prime) ");
	        String cabType = sc.next();
	        
	        if (cabType.equalsIgnoreCase("Micro")) {
	            System.out.println(" Calculated hire price for "+userName+": "+Cabkm.micro(km));
	        }
	        else if(cabType.equalsIgnoreCase("mini")) {
	            System.out.println(" Calculated hire price for "+userName +": "+Cabkm.mini(km));
	        }
	        else if(cabType.equalsIgnoreCase("prime")) {
	            System.out.println(" Calculated hire price for "+userName+": "+Cabkm.prime(km));
	        }
	        else {
	            System.out.println("Please enter the cab type");
	        }
	        System.out.println("-----------------ThankYOu----------------------------");
	}
	

}
