package com.chainsys.day3;
import java.util.*;

public class Pattern3 {
	public static void main(String[]args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the input");
		//int n=sc.nextInt();
		for(int i=4;i>=1;i--) {
			for(int s=i;s<4;s++) {
				System.out.printf(" ");
			}
			for(int j=1;j<=i*2-1;j++) {
				if(j%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}
