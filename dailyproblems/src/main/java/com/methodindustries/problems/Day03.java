package com.methodindustries.problems;


 class TwoSum {
	public static int[] run(int nums[], int target) {
		int[] results= {-1,-1};
		for (int i=0;i<nums.length;i++) {
			for (int j=i+1;j<nums.length;j++) {
				if (nums[i]+nums[j]==target) {
				results=new int[] {i,j};
				}
			}
		}
		    
		
		//System.out.println(""+results[0]+""+results[1]);
		return results;
		
	}
	
	
}
