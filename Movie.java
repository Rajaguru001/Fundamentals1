package com.chainsys.day2;

import java.util.Scanner;

public class Movie {
	 public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);     
	     String moviename;
	     System.out.println("enter the moviename:");
	     moviename=sc.next();     
	     System.out.println(moviename + " is good movie" );
	     
	     double duration;
	     System.out.println("enter the duration:");
	     duration=sc.nextDouble();
	     System.out.println(" Total Duration is:"+duration);
	     
	     int year;
	     System.out.println("enter the movie release year:");
	     year=sc.nextInt();
	     System.out.println("movie release year:"+year);
	  
	     int total_songs;
	     System.out.println("enter the Total no Songs");
	     total_songs=sc.nextInt();
	     System.out.println("Total songs is:"+total_songs);
	    
	     String hero_name;
	     System.out.println("Enter the HeroName:");
	     hero_name=sc.next();
	     System.out.println("Hero name is:"+hero_name);
	     
	     boolean good_or_bad;
	     System.out.println("movies is good ture or false");
	     good_or_bad=sc.nextBoolean();
	     System.out.println(good_or_bad);
	     
	     
	     
	     
	     
	     
	     
	     
	     
		 
	 }
	 

}
