package com.chainsys.day3;

public class LogicalOperator {

	public static void main(String[] args) {
		int a = 20;
		int b = 12;
		boolean lessthan = a < b;
		boolean lessthanequal = a <= b;
		boolean greaterthan = a > b;
		boolean greaterthanequal = a >= b;
		boolean equalto = a == b;

		System.out.println("Lessthan a<b is         :" + lessthanequal);
		System.out.println("lessthanequal a<=b is   :" + greaterthan);
		System.out.println("greaterthan a>b is      :" + greaterthan);
		System.out.println("greater than equal a>=b :" + greaterthanequal);
		System.out.println("equal to a==b           :" + equalto);

	}

}
