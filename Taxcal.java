package com.chainsys.day3;
import java.util.*;

public class Taxcal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

         System.out.print("Enter your gross salary: ");
         double gross = sc.nextDouble();
         if(gross<0) {
             System.out.print("Enter the correct gross salary: ");
             gross = sc.nextDouble();
         }

         System.out.print("Enter your total savings: ");
         double Savings = sc.nextDouble();
         if(Savings<0) {
             System.out.print("Enter the correct Total savings: ");
             Savings = sc.nextDouble();
         }

         double taxableIncome = calculateTaxableIncome(gross,Savings);
         double tax = taxCalculator(taxableIncome);

         System.out.println("Tax to be paid: Rs. " + tax);
     }

     public static double calculateTaxableIncome(double grossSalary, double totalSavings) {
         double taxableIncome = grossSalary - Math.min(totalSavings, 100000);
         return taxableIncome < 0 ? 0 : taxableIncome;
     }

     public static double taxCalculator(double taxableIncome) {
         double tax = 0;

         if (taxableIncome <= 100000) {
             tax = 0;
         } else if (taxableIncome <= 200000) {
             tax = (taxableIncome - 100000) * 0.1;
         } else if (taxableIncome <= 500000) {
             tax = 10000 + (taxableIncome - 200000) * 0.2;
         } else {
             tax = 50000 + (taxableIncome - 500000) * 0.3;
         }

         return tax;
     }
 

}
