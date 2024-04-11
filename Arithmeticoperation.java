package com.chainsys.day2;

import java.util.*;

public class Arithmeticoperation {
	public static void main(String[] agrs) {
		char operator;
		double number1, number2, result;

		Scanner input = new Scanner(System.in);
		System.out.println("enter the number 1");
		number1 = input.nextDouble();

		System.out.println("enter the number 2");
		number2 = input.nextDouble();

		System.out.println("enter the operator only +,-,*,/");
		operator = input.next().charAt(0);

		switch (operator) {
		case '+':
			result = number1 + number2;
			System.out.println(number1 + "+" + number2 + "=" + result);
			break;

		case '-':
			result = number1 - number2;
			System.out.println(number1 + "-" + number2 + "=" + result);
			break;

		case '*':
			result = number1 * number2;
			System.out.println(number1 + "*" + number2 + "=" + result);
			break;

		case '/':
			result = number1 / number2;
			System.out.println(number1 + "/" + number2 + "=" + result);
			break;

		default:
			System.out.println("this operator is invalid:");
			break;

		}

	}

}
