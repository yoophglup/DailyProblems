package com.methodindustries.problems;

//Write a function that reverses a string.
//The input string is given as an array of characters s.

//Example 1:
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]

//Example 2:
//Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]



public class Day01Runner {
		public static void main(String args[]) {
	 		char[] s = {'h','e','l','l','o'};
	 		//char[] s = {'H','a','n','n','a','h'};
	 		System.out.print("Input : ");
	 		System.out.println(s); 		
			System.out.print("Output: ");
	 		System.out.println(Day01.run(s));
			
		}

	}


