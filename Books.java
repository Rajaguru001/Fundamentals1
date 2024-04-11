package com.chainsys.book;

import java.util.Scanner;

public class Books{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String author_name;
		System.out.println("Enter the Author Name");
		author_name=sc.next();
		System.out.println("Author Name is:"+author_name);
		
		int year;
		System.out.println(" Enter year of Release:");
		year=sc.nextInt();
		System.out.println("Year of Release:"+year);
		
		int page;
		System.out.println("Enter total Pages:");
		page=sc.nextInt();
		System.out.println("Total page no is:"+page);
		
		boolean story_type;
		System.out.println("book is good:");
		story_type=sc.nextBoolean();
		System.out.println(story_type);
		
		int total_books_selling;
		System.out.println("Total no books selling:");
		total_books_selling=sc.nextInt();
		System.out.println("Total no books selling:"+total_books_selling);
		
		
		
		
	}
	

}
