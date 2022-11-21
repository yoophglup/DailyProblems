package com.methodindustries.problems;

//Given a non-empty array of integers nums, every element appears twice except for one.
//Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

//Example 1:
//Input: nums = [2,2,1]
//Output: 1

//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4

//Example 3:
//Input: nums = [1]
//Output: 1
//Must use a Hashtable

public class Day07HashmapRunner {
	public static void main(String args[]) {

		int[] nums= {4,1,2,1,2};

		//int[] nums= {5,5,9,13,1,2,9,1,2};
		System.out.println(Day07Hashmap.singleNumber(nums));


	}
}