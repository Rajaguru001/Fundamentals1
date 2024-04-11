package com.chainsys.cabfare;

public class Cabkm {
	 public static double micro(double distance) {
	        double price = distance*10;
	        double amountSaved =DiscountForCab.discountCalculation(price);
	        return amountSaved;
	        
	    }
	    public static double mini(double distance) {
	        double price = distance*15;
	        double amountSaved =DiscountForCab.discountCalculation(price);
	        return amountSaved;
	        
	    }
	    public static double prime(double distance) {
	        double price = distance*20;
	        double amountSaved =DiscountForCab.discountCalculation(price);
	        return amountSaved;
	        
	    }


	}

