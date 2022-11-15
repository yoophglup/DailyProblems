package com.methodindustries.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Day06c {
	public static String IntToRoamn(int input) {

	    HashMap<Integer, String> RomanNumeral = new HashMap<Integer, String>();
	    RomanNumeral.put(1,"I");
	    RomanNumeral.put(5,"IV");
	    RomanNumeral.put(5,"V");
	    RomanNumeral.put(9,"IX");
	    RomanNumeral.put(10,"X");
	    RomanNumeral.put(40,"XL");
	    RomanNumeral.put(50,"L");
	    RomanNumeral.put(90,"XC");
	    RomanNumeral.put(100,"C");
	    RomanNumeral.put(400,"CD");
	    RomanNumeral.put(500,"D");
	    RomanNumeral.put(900,"CM");
	    RomanNumeral.put(1000,"M");
    	int nums[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
     	
    	String returnvalue="";
    	for (int x:nums) {
    		while (input >=x) {
    			input= input - x;
    			returnvalue=returnvalue.concat(RomanNumeral.get(x));
    		}
    	}
    	
           	   
		return returnvalue;			
    	
	}
	
	
}	
    	
    	
    	
    	
    	
    	
    	
	   
	   
	   
	   
	   

	    
	    
	    
    

