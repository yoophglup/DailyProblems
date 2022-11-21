package com.methodindustries.problems;

public class Day10Runner {
	public static void main(String args[]) {

		// Alex considers a string to be valid if all characters of the string appear
		// the same number of times. It is also valid if he can remove just  character
		// at  index in the string, and the remaining characters will occur the same
		// number of times. Given a string , determine if it is valid.
		// If so, return YES, otherwise return NO.

		// Example 1:
		// Input: s = "bat"
		// Output: YES

		// Example 2:
		// Input: s = "batt"
		// Output: YES


		// Example 3:
		// Input: s = "bbatt"
		// Output: NO

		// Example 4:
		// Input: s = "battt"
		// Output: NO
		
		
		String input="bbatt";
		System.out.println(Day10.isValid(input));


	}
}