package com.chainsys.methods;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindSameValue {

	public static void main(String[] args) {
		String poet = ("if you notice This notice, you will notice That This notice is not worth noticing");
		// Pattern p = Pattern.compile("worth");
		// Pattern p=Pattern.compile("^if");
		// Pattern p=Pattern.compile("noticing$");
		// Pattern p=Pattern.compile("A-Z");
		Pattern p = Pattern.compile("T|t");

		Matcher m = p.matcher(poet);
		while (m.find()) {
			System.out.println(m.group() + " starts: " + m.start() + " ends: " + m.end());
		}
	}

}
