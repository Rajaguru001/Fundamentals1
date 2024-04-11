package com.chainsys.cabfare;

public class Discount {

	public static double discountfare(double cabFare) {

        double discount=0;
		if (cabFare > 5000) {
            discount = cabFare * 0.5; 
        } 
		else if (cabFare > 2000) 
		{
            discount = cabFare * 0.02; 
        }

		return discount;
	}

}
