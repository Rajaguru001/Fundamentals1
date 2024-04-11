package com.chainsys.day3;

import java.util.*;

public class Attendence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details:");
		System.out.println("Enter the no of class held");
		int classheld = sc.nextInt();
		// validation
		if (classheld < 0) {
			System.out.println("enter the correct vaule");
			classheld = sc.nextInt();
		}

		System.out.println("Enter the no of Class Attend");
		int classattend = sc.nextInt();
		if (classattend < 0) {
			System.out.println("enter the correct vaule");
			classattend = sc.nextInt();
		}
		double percentage;
		percentage = ((double) classattend / classheld) * 100;
		System.out.println("The percentage obtained by the student:" + percentage + "%");

		if (percentage >= 75) {
			System.out.println("You are eligible to attend" + percentage + "%");

		} else {
			System.out.println("Enter your Medical issue Y/N");
			char medicalissue = sc.next().charAt(0);
			if (medicalissue == 'y' || medicalissue == 'Y') {
				System.out.println("You are eligible to attend");
			}

			else if (medicalissue == 'n' || medicalissue == 'N') {
				System.out.println("you are not eligible to attend");
			}

			else {
				System.out.println("enter the correct value (Y/N):");
				medicalissue = sc.next().charAt(0);
				if (medicalissue == 'y' || medicalissue == 'Y') {
					System.out.println("you are allowed for exam");
				}

				else if (medicalissue == 'n' || medicalissue == 'N') {

					System.out.println("enter the corrext (Y/N)");
				}

			}
		}

	}
}
