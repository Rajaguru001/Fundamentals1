package com.chainsys.cabfare;

	public class DiscountForCab {
	    public static double discountCalculation(double price) {
	        
	        if(price>=2000 && price<5000) {
	        	System.out.println("---------------------------------");
	            System.out.println("you are eligible for 2% discount");
	            double discountPrice = price*0.05;
	            double payAble = price - discountPrice;
	            return payAble;
	        }
	        else if(price>=5000) {
	        	System.out.println("---------------------------------");
	            System.out.println("you are eligible for 5% discount");
	            double discountPrice = price*0.05;
	            double payAble = price - discountPrice;
	            return payAble;
	        }
	        else {
	        	System.out.println("----------------------------------------");
	            System.out.println("sorry you are not eligible for discount");
	            return price;
	        }
	    }

	}

