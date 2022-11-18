package com.methodindustries.problems;

import java.util.HashMap;

class BetterTwoSum{
	public static int[] run(int nums[], int target) {
		HashMap<Integer,Integer> values = new HashMap<Integer,Integer>();		
		int found[]= {-1,-1};
		for (int i=0;i<nums.length;i++) {			
			values.put(nums[i], i);
		}	
		for (Integer x: values.keySet()) {
			if (values.get(7-x)!=null){		
				//System.out.print(x+"+");
				//System.out.print(target-x+" in Hash table");
				//System.out.println(" at index of "+values.get(target-x));
				found[0]=values.get(target-x);
				found[1]=values.get(x);
				return found;
			}		
		}	
		return found;
	}
	
}
