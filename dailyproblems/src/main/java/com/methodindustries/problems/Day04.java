package com.methodindustries.problems;

public class Day04 {
	    public static String reverseWords(String s) {
	    	String trimmed = s.trim();
	    	String Sarray[]=(trimmed.replaceAll("\\s+", " ")).split(" ");
	    	String returnvalue="";
	    	for (int i=Sarray.length-1; i >=0 ; i--)
	    	{
	    		if (i==0) {
	    			returnvalue+=Sarray[i];
	    		}else {
		    		returnvalue+=Sarray[i] + " ";
	    		}
	    	}
	    	System.out.println(returnvalue);
				return returnvalue;
	    }
	
}
