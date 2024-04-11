package com.chainsys.methods;

public class Merge {
	class Main {
		public static void main(String[] args) {

			String first = "Java ";
			System.out.println("First String: " + first);

			String second = "Programming";
			System.out.println("Second String: " + second);
			
			String Merge = first.concat(second);
			System.out.println("Joined String: " + Merge);
			
			String third= "bye";
			System.out.println("third String: "+ third);
			
			String fourth="world";
			System.out.println("fourth String: "+ fourth);

			
			String Merge2 =third.concat(fourth);
			System.out.println("Joined String: "+ Merge2);
		}
	}

}
