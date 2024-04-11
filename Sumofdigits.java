package com.chainsys.day3;

import java.util.*;

public class Sumofdigits {
	public static void main(String[] agrs) {
		System.out.println("enter the values:");
		Scanner sc = new Scanner(System.in);
		int i, n = sc.nextInt();
		// validation
		if(n<0) {
			System.out.println("input Error");
		}
		int sum = 0;
		for (i = 1; i <= n; i++) {
			sum = sum + i;
			System.out.println(i);

		}
		System.out.println(sum);

	}

}
