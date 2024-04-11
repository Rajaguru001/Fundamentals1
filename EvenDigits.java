package com.chainsys.day3;

import java.util.*;

public class EvenDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		// user should not enter the negative value//
		if (n < 0) {
			System.out.println("input error");
		}
		int rem, temp = 0;
		while (n > 0) {
			rem = n % 10;
			temp = temp + rem;
			if (temp % 2 == 0)
				System.out.println(temp);
			n = n / 10;
			temp = 0;

		}
	}

}
