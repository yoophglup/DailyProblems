package com.methodindustries.problems;

public class VersionNumberCompareRunner {
	public static void main(String args[]) {

		// given two strings representation of version numbers display the one which is greater
		// if the first string is greater return 1, if the second string is greater return 0, if they are the same return -1


		String s1 = "1.0.37.1";

		String s2 = "1";
		
		System.out.println(VersionsNumber.compare(s1,s2));
		

	}
}