package com.chainsys.day3;

public class Equation2 {
	public static void main(String[]agrs) {
		int x=2;
		int y=5;
		int z=0;
	    boolean equal=(x==2);
	    boolean notequal=(x!=5);
	    boolean andoperator=(x!=5 &&y>=5);
	    boolean oroperator=(z!=5||x==2);
	    boolean notequalY=!(y<10);
	   
	    System.out.println("The equation is "+equal);
	    System.out.println("The equation is "+notequal);
	    System.out.println("The equation is "+andoperator);
	    System.out.println("The equation is "+oroperator);
	    System.out.println("The equation is "+notequalY);
	    
	    
	}

}
