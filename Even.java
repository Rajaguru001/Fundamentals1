package com.chainsys.day3;

import java.util.*;

public class Even {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		
		//validation
		if (n < 0) {
			System.out.println("Input Error");
		}
		if(n>0)
		{	

		System.out.println("it is a even numbers");
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {

				System.out.println(i);
			}
		}
		System.out.println("it is a odd numbers");
		for (int i = 1; i < n; i++) {

			if (i % 2 != 0) {

				System.out.println(i);
			}
		}
		System.out.println("The cubic value is: " + n * n * n);
	}
	}

}