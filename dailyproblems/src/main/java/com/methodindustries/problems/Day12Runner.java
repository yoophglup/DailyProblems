package com.methodindustries.problems;

public class Day12Runner {
	public static void main(String args[]) {
		// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
		// determine if the input string is valid.

		// An input string is valid if:
		//
		// 1. Open brackets must be closed by the same type of brackets.
		// 2. Open brackets must be closed in the correct order.

		// Example 1:
		// Input: s = "()"
		// Output: true
		//
		// Example 2:
		// Input: s = "()[]{}"
		// Output: true
		//
		// Example 3:
		// Input: s = "(]"
		// Output: false
		//
		// Example 4:
		// Input: s = "([)]"
		// Output: false
		//
		// Example 5:
		// Input: s = "{[]}"
		// Output: true
		String inputString="{()}]";
		System.out.println(Day12.isvalid(inputString));
		
		
		
		
	}
}