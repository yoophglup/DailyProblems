package com.methodindustries.problems;

//Two strings are anagrams of each other if the letters of one string can be
//rearranged to form the other string. Given a string, find the number of pairs
//of substrings of the string that are anagrams of each other.

//Example 1:
//Input: s = "mom"
//Output: 2
//Explanation: ['m','m'] and ['mo','om'] at positions [[0],[2]] and
//[[0,1],[1,0]] respectively

//Example 2:
//Input: s = "abcd"
//Output: 0

//Example 3:
//Input: s = "abba"
//Output: 4
//Explanation: ['a','a'], ['ab','ab'], ['b','b'], ['abb','bba'] at [[0], [3]],
//[[0, 1], [2, 3]], [[1], [2]], and [[0, 1, 2], [1, 2, 3]] respectively

//This is 10.5 labeled as 11 - this has NOT been Completed!

public class Day11Runner {
	public static void main(String args[]) {

		// Example 1:
		// Input: s = "anagram", t = "nagaram"
		// Output: true

		String input1="anagrama";
		String input2="nagaram";
		System.out.println(Day11.isanagram(input1,input2));


	}
}