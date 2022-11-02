package com.methodindustries.problems;

import java.util.HashMap;

public class Day09 {
    public static Boolean isanagram(String s1,String s2) {
	    HashMap<Character, Integer> CharBank1 = new HashMap<Character, Integer>();
	    HashMap<Character, Integer> CharBank2 = new HashMap<Character, Integer>();
	    Boolean isanagram=false;
    	for (Character x : s1.toCharArray()) {
    		if (CharBank1.containsKey(x)) {
    			int n = CharBank1.get(x)+1;  			
    			CharBank1.put(x, n);
    		}else {
    			CharBank1.put(x, 1);
    		}
    	}
    	for (Character y : s2.toCharArray()) {
    		if (CharBank2.containsKey(y)) {
    			int n = CharBank2.get(y)+1;  			
    			CharBank2.put(y, n);
    		}else {
    			CharBank2.put(y, 1);
    		}
    	}
    	for (Character z : CharBank1.keySet()) {   		
    		if (CharBank2.containsKey(z)) {
    			if (CharBank1.get(z)==CharBank2.get(z)) {
        			System.out.println(z);
        			isanagram=true;
    			}else {
    				System.out.println("this character appears a different number of times : "+z);
    				return false;
    			}
    		}else {
    			System.out.println("This character is not in both: "+z);
    			return false;
    			
    		}
    	}
    	return isanagram;
    }
}
    		
