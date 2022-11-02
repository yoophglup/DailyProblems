package com.methodindustries.problems;

public class Day08 {
    public static int singleLetter(String words) {
    	for (char ch: words.toCharArray()) {
    		if (words.indexOf(ch)==words.lastIndexOf(ch)) {
    			return words.indexOf(ch);
    		}
   		
    	}

		return -1;

    }
}
