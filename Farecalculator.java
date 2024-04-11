package com.chainsys.cabfare;

public class Farecalculator {
	public static double calculatefare(double km,  String cabType){
		double cabRate = 0;
        switch (cabType) {
            case "micro":
                cabRate = 10;
                break;
            case "mini":
                cabRate = 15;
                break;
            case "prime":
                cabRate = 20;
                break;
            default:
                System.out.println("Error Input.");
		}
		
		
		return km*cabRate;

}
}
