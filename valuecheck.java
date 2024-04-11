package com.chainsys.methods;

import java.util.*;

public class valuecheck {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first value:");
		int value = sc.nextInt();

		System.out.println("Enter the second value:");
		int value2 = sc.nextInt();

		System.out.println("Enter the Third value:");
		int value3 = sc.nextInt();

		System.out.println("Enter the fourth value:");
		int value4 = sc.nextInt();

		System.out.println(check1(value));
		System.out.println(check2(value2, value3, value4));

	}

	public static boolean check1(int num) {
		if (num > 13 && num < 19) {
			return true;
		}
		return false;

	}

	public static boolean check2(int num, int num2, int num3) {
		if (num >= 13 && num <= 19 || num2 >= 13 && num2 <= 19 || num3 >= 13 && num3 <= 19) {
			return true;

		}
		return false;
	}

}
