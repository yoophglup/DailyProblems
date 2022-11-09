package com.methodindustries.problems;

import java.util.HashMap;

public class Day06 {
	public static int romanToInt(String s) {
		//create hashmap of char to int
		//"CDXLIV"
	    HashMap<Character, Integer> RomanNumeral = new HashMap<Character, Integer>();
	    RomanNumeral.put('I',1);
	    RomanNumeral.put('V',5);
	    RomanNumeral.put('X',10);
	    RomanNumeral.put('L',50);
	    RomanNumeral.put('C',100);
	    RomanNumeral.put('D',500);
	    RomanNumeral.put('M',1000);
	    //create an extra unused char at the end of the string to prevent error at > comparison
	    String ps=s.concat("0");
	    //initialize a return int, set to 0
	    int returnvalue=0;
	   //loop through all original char values
	    for(int i = 0; i<ps.length()-1; i++) {
	    	//if our iterator is not the last key of our original string then
		    if (i!=ps.length()-2) {
		    //check if the current value is greater than the next value then
	        if(RomanNumeral.get(ps.charAt(i)) >= RomanNumeral.get(ps.charAt(i+1))) {
	        	//convert the current value and add it to the return key
	        	returnvalue=returnvalue+RomanNumeral.get(s.charAt(i));
	        }
	        else{
	        	//the next character is large than the current, so convert the key then subtract from the returnvalue
	        	returnvalue = returnvalue - RomanNumeral.get(ps.charAt(i));
	          }	
		    }else {
		    	//if the current value is the last character of the original string, then add it to the return key 
	        	returnvalue=returnvalue+RomanNumeral.get(ps.charAt(i));

		    }
		}
		return returnvalue;			
    }
}
