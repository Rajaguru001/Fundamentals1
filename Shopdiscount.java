package com.chainsys.day3;
import java.util.*;

public class Shopdiscount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter the quantity:");
		double input=sc.nextInt();
		while(true) 
			if(input>0) {
				break;
			}
			else {
				System.out.println("enter the positive interger:");
				input=sc.nextInt();
			}
		
		double totalamount=input*100;
		if(totalamount>1000) 
		{
			double percentage=(totalamount*0.1);
			double total=totalamount-percentage;
			System.out.println("--------------------------------");
			System.out.println("congratulation you have discount");
			System.out.println("--------------------------------");
			System.out.println("your dicount amount = "+total);
		}
		else {
			System.out.println("total amount "+totalamount);
			System.out.println("you have no discount:");
		}
		
		

	}

}
