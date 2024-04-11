package com.chainsys.day3;

import java.util.*;

public class FIzzbuzz {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
	   int	n=sc.nextInt();
	   //validation
	    if(n<0 || n<=100) {
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			System.out.println(i);
		}
		
	}else
	    System.out.println("error");
	}
}
