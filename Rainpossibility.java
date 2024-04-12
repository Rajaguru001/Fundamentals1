package com.chainsys.day3;

import java.util.Scanner;

public class Rainpossibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Is it is raining (Y/N):");

		char rain=sc.next().charAt(0);
		
		while(true) {

			if(rain=='y'||rain == 'Y'||rain=='n'||rain=='N') 

			{

				break;

			}

			else {

				System.out.println("invalid data:");

				System.out.print("Enter the proper data(Y/N):");

				 rain=sc.next().charAt(0);

			}

		}

			

		{

		if(rain=='y'||rain == 'Y')

		{

			System.out.println("Bring an umbrella");

			System.out.print("Enter the temperature:");

			int temp=sc.nextInt();

			if(temp<32)

			{

				System.out.println("Bring an heavy RAIN JACKET");

			}

			else if(temp>33 && temp<50){
				System.out.println("bring light jacket:");
				
			}
		
		else

		{

			System.out.println("no rain");

		}

		

	}



	}

}
}
