package com.chainsys.methods;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Find {
	public static void main(String[]agrs) {
		Pattern prgm=Pattern.compile("Hello",Pattern.LITERAL);
		Matcher matcher=prgm.matcher("Hello#%^^");
		boolean found=matcher.find();
		if(found) {
			System.out.println("Match found:");
		}
		else {
			System.out.println("Not match found");
		}
		
		
	}

}
