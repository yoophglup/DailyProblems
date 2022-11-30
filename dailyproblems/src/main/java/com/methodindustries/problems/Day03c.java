package com.methodindustries.problems;


class BestTwoSum{
	public static int[] run(int nums[], int target) {
		int i=0, j=nums.length-1;
		int[] notfound= {-1,-1};
		
		while (i<j) {
			if (nums[i]+nums[j]==target) {
				int[] found= {i,j};
				return found;
			}else {
				if (nums[i]+nums[j]>target) {
					j--;
				}else {
					i++;
				}
			}
			
		}
		
		
		
		return notfound;
	}
}
