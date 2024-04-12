package com.chainsys.day3;
import java.util.*;

public class Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thier salary:");
		int salary=sc.nextInt();
		while(true)
			if(salary>0) {
			break;
		}
		else {
			System.out.println("Enter the poistive value:");
			salary=sc.nextInt();
			
		}
		
		System.out.println("Enter year of service:");
		int input =sc.nextInt();
		while(true)
			if(input>0) {
				break;
			}
			else {
				System.out.println("Enter the positive value:");
				input=sc.nextInt();
			}
		if(input>5) 
		{
			double bonus=salary*0.05;
			System.out.print("your salary: "+salary);
			System.out.println("  your bonus= " +bonus);
		}
		else 
		{
			 
			System.out.println("you have no bonus:"+salary);
			
		}

	}

}
