package com.chainsys.day3;
import java.math.*;

public class Equation {
	public static void main(String[]agrs){
		int y=6;
		// The given value from 5 to 10
		if(y<5 || y>10) {
			System.out.println("input error");
		}
		if(y>=5 && y<=10)    
		{
		
		while(y<=10) {
			double result=2*Math.pow(y, 2)+y+5;
			System.out.println("y="+y+"the value is "+result);
			y++;
		}
		
		}
		
}
}
