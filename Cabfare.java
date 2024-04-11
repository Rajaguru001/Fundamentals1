package com.chainsys.cabfare;
import java.util.Scanner;

public class Cabfare {

	public static void main(String[] args) 
	{
	
		        Scanner scanner = new Scanner(System.in);


		        System.out.print("Enter the Total kilometer: ");
		        double km = scanner.nextDouble();
		        scanner.nextLine();
		 
		        System.out.print("Enter Cab Type Vechile (/Micro/,/Mini/,/Prime/): ");
		        String cabType = scanner.nextLine().toLowerCase();
		      
		        double totalamount =Farecalculator.calculatefare(km,cabType);

		        double cabFare = km * totalamount;
		        System.out.println("Cab Fare: Rs." + cabFare);
		        

		      
		      double discount = 0;
				System.out.println("Discounted Bill Amount: Rs." + discount);

		       
		        System.out.println("Enter Coupon Code (COUPON_CODE 2/COUPON_CODE 5): ");
		        String couponCode = scanner.nextLine();

		        if (couponCode.equals("COUPON CODE_2")) {
		            discount *= 0.02; 
		        } else if (couponCode.equals("COUPON CODE_5")) {
		            discount *= 0.5; 
		        }

		        System.out.println("Total Bill after Coupon Code: Rs." + discount);

		        
		       }
}
	
		       