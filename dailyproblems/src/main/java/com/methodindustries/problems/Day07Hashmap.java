package com.methodindustries.problems;

import java.util.HashMap;

public class Day07Hashmap {
    public static int singleNumber(int[] nums) {
	    HashMap<Integer, Integer> IntBank = new HashMap<Integer, Integer>();
    	int ct=0;    	
    	for (int x : nums) {
    		if (IntBank.containsKey(x)) {
    			IntBank.put(x, 2);
    		}else {
    			IntBank.put(x, 1);
    		}

    		ct=ct+1;
    		    	}
    	for (int x : nums) {
    		if (IntBank.get(x)==1) {
    			return x;
    		}
    	}

    		
    
        	

  
    	

		return -1;

    }
}
