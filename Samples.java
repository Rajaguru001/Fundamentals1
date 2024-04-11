package com.chainsys.methods;

public class Samples {
	public static void main(String[] args) {
		String text = "Welcome,World!";
		String text2="hello";
		int size = text2.length();
		System.out.println("size of string: " + size);

		char first = text.charAt(2);
		System.out.println("First character: " + first);

		String changedText = text.replace('l', 'z');
		System.out.println("String after replacing 'l' with 'z': " + changedText);

		String anotherText = "Welcome,Program!";
		boolean isEqual = text.equals(anotherText);
		System.out.println("Are the strings equal? " + isEqual);
		
		String merge= text.concat(text2);
		System.out.println("The Merge Text: "+merge);

		String substring = text.substring(7);
		System.out.println("Substring : " + substring);

		int commaposition = text.indexOf(',');
		System.out.println("Index of comma in the string: " + commaposition);

		int lastIndexOfSpace = text.lastIndexOf(' ');
		System.out.println("Last index of space in the string: " + lastIndexOfSpace);

		String upperText = text.toUpperCase();
		System.out.println("Uppercase string: " + upperText);

		String lowerText = text.toLowerCase();
		System.out.println("Lowercase string: " + lowerText);

		String spaceText = "   Welcome!World   ";
		String trimmedText = spaceText.trim();
		System.out.println("Trimmed string: " + trimmedText);

		boolean firsttext = text.startsWith("Hello");
		System.out.println("start with 'Hello'? " + firsttext);

		boolean endsWithExclamation = text.endsWith("!");
		System.out.println("string end with '!'? " + endsWithExclamation);
		
		
	}
}
