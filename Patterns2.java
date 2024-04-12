package com.chainsys.day3;

import java.util.Scanner;


public class Patterns2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Number : ");
           int Number = sc.nextInt();
           
           do {
               if (Number < 0) {
                   System.out.println("Please enter a positive number.");
                   Number = sc.nextInt();
               }
           } while (Number < 0);
           
          
   
               for(int i=1; i<Number; i+=2)
               {
                   for(int j=i; j<=Number; j+=1)
                   {
                       System.out.print(" ");
                   }
                   for(int j=1; j<=i; j+=1)
                   {
                       System.out.print("*");
                   }
                   System.out.println();
               }
               for(int i=1; i<=Number; i+=2)
               {
                   for(int j=1; j<=i; j+=1)
                   {
                       System.out.print(" ");
                   }
                   for(int j=i; j<=Number; j+=1)
                   {
                       System.out.print("*");
                   }
                   System.out.println();
               }

	}

}
