package com.chainsys.book;
import java.util.*;

public class Student {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Name is:"+name);
		
		int id;
		System.out.println("Enter the Id:");
		id=sc.nextInt();
		System.out.println("the id is"+id);
		
		int rollno;
		System.out.println("Enter the RollNo:");
		rollno=sc.nextInt();
		System.out.println("The RollNo is:"+rollno);
		
		boolean graduated;
		System.out.println("course completed True or Flase");
		graduated=sc.nextBoolean();
		
		float cgpa;
		System.out.println("CGPA of the student:");
		cgpa=sc.nextFloat();
		System.out.println("CGPA is"+cgpa);
		
		
		
		

	}

}
