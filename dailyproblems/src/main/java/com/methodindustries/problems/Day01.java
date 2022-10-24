package com.methodindustries.problems;

public class Day01 {
	 public static String run(char[] s) {
		char[] revs=new char[s.length];
		for (int i=0; i<s.length;i++) {
			char tempchar=s[i];
			revs[s.length-i-1]=tempchar;
		}
		String returnstring=new String (revs);
		return returnstring;


	}

	
}
