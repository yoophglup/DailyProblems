package com.methodindustries.problems;

import java.util.HashMap;

public class Day10 {
    public static String isValid(String s) {
	    HashMap<Character, Integer> CharBank = new HashMap<Character, Integer>();
	    Boolean isanagram=false;
    	for (Character x : s.toCharArray()) {
    		if (CharBank.containsKey(x)) {
    			int n = CharBank.get(x)+1;  			
    			CharBank.put(x, n);
    		}else {
    			CharBank.put(x, 1);
    		}
    	}
    	int ct=0;
    	for (Character z : CharBank.keySet()) {   		
    		if (CharBank.get(z)<2) {
    			
    		}
    		else {
    			//System.out.println("This character occurs more than once: "+z);
    			ct=ct+1;
    			if ((ct>1) || (CharBank.get(z) > 2)) {
    				//System.out.println("too many characters occur more than once");
    				return "NO";
    			}
    		}
    	}
    	return "YES";
    }
}
    		
