package com.chainsys.bank;

import java.util.*;

public class Bank {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String branch;
		System.out.println("Enter the branch location:");
		branch=sc.next();
		System.out.println("Name is:"+branch);
		
		int ifsc;
		System.out.println("Enter the ifsc:");
		ifsc=sc.nextInt();
		System.out.println("the id is"+ifsc);
		
		int account_no;
		System.out.println("Enter the acoountNo:");
		account_no=sc.nextInt();
		System.out.println("The RollNo is:"+account_no);
		
		boolean current;
		System.out.println("current account True or false");
		current=sc.nextBoolean();
		
		float balance;
		System.out.println("account balance:");
		balance=sc.nextFloat();
		System.out.println("balance is:"+balance);
		
		
		
		

	}

}


