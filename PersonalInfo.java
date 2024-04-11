package com.chainsys.day3;

import java.util.*;

public class PersonalInfo {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age:");
		int age = sc.nextInt();
		//validation
		if (age < 0 && age < 100) {
			System.out.println("enter the valid data");
		
		}
			System.out.println("Enter the Gender(M/F)");
			char sex = sc.next().charAt(0);
				System.out.println("enter the Marital Status(Y/N)");
				char marital = sc.next().charAt(0);
					// validation

					if (sex == 'f' || sex == 'F') {
						System.out.println("you will work only in urban areas:");
					} else if (sex == 'm' || sex == 'M') {
						if (age > 20 && age < 40) {
							System.out.println("He will work in Anywhere");
						}

						else if (sex == 'm' || sex == 'M') {
							if (age > 40 && age < 60) {
								System.out.println("he will work in urban areas only");
							}
						}

					}
				}
		
			}
		


