package com.methodindustries.problems;

public class Day07 {
    public static int singleNumber(int[] nums) {
    	
		//int[] nums= {4,1,2,1,2};

    	int x=nums[0];
    	for (int i=1;i<nums.length;i++) {

    		x=x^nums[i];
  
    	}

		return x;

    }
}
