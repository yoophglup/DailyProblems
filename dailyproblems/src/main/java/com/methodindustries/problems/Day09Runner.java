package com.methodindustries.problems;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true

//Example 2:
//Input: s = "rat", t = "car"
//Output: false



public class Day09Runner {
	public static void main(String args[]) {

		// Example 1:
		// Input: s = "anagram", t = "nagaram"
		// Output: true

		String input1="anagrama";
		String input2="nagaram";
		System.out.println(Day09.isanagram(input1,input2));


	}
}