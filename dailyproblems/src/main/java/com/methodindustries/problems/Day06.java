package com.methodindustries.problems;

import java.util.HashMap;

public class Day06 {
	public static int romanToInt(String s) {
		
	    HashMap<Character, Integer> RomanNumeral = new HashMap<Character, Integer>();
	    RomanNumeral.put('I',1);
	    RomanNumeral.put('V',5);
	    RomanNumeral.put('X',10);
	    RomanNumeral.put('L',50);
	    RomanNumeral.put('C',100);
	    RomanNumeral.put('D',500);
	    RomanNumeral.put('M',1000);
	    String ps=s.concat("0");
	    int returnvalue=0;
	    for(int i = 0; i<ps.length()-1; i++) {
	    	
		    if (i!=ps.length()-2) {

	        if(RomanNumeral.get(ps.charAt(i)) >= RomanNumeral.get(ps.charAt(i+1))) {
	        	returnvalue=returnvalue+RomanNumeral.get(s.charAt(i));
	        }
	        else{
	        	returnvalue = returnvalue - RomanNumeral.get(ps.charAt(i));
	          }	
		    }else {
	        	returnvalue=returnvalue+RomanNumeral.get(ps.charAt(i));

		    }
		}
		return returnvalue;			
    }
}
