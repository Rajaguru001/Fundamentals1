package com.chainsys.hospital;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String hospital_name;
		System.out.println("Enter the hospital name:");
		hospital_name=sc.next();
		System.out.println("The Hospital name is:"+hospital_name);
		
		int ambulance;
		System.out.println("Enter the No of Ambulance:");
		ambulance=sc.nextInt();
		System.out.println("Total Ambulamce is:"+ambulance);
		
		int wards;
		System.out.println("enter the no of wards");
		wards=sc.nextInt();
		System.out.println("No of Wards is:"+wards);
		
		int surgerns;
		System.out.println("No of surgerens ");
		surgerns=sc.nextInt();
		System.out.println("total noof surgerens is:"+surgerns);
		
		boolean labtest_centre;
		System.out.println("Lapcentre located true or false");
		labtest_centre=sc.nextBoolean();
		System.out.println(labtest_centre);
		
		
		
		
		
		
		
		
		
		
	}

}
