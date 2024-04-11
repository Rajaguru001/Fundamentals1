package com.chainsys.day3;
import java.util.*;
public class Tables {
	public static void main(String[]agrs) {
		System.out.println("Enter the value:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Input Error");
		}
		int i,endvalue=sc.nextInt();
		for(i=1;i<=endvalue;i++) {
			System.out.printf("%d * %d = %d ",n,i,n*i);
			System.out.println();
		}
		
	}

}
