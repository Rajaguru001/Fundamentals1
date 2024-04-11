package com.chainsys.day3;

import java.util.*;

public class Patterns {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);

		int i, j, n;

		n = sc.nextInt();
		//validation should not give negative numbers
		if (n < 0) {
			System.out.println("input Error");
		}
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.printf("* ");
			}
			System.out.println(" ");
		}

	}
}
