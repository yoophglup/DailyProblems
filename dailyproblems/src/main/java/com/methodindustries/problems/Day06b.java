package com.methodindustries.problems;

import java.util.HashMap;

public class Day06b {
	public static String IntToRoamn(int input) {
		//444
		// Example 2:
		// Input: s = "CDXLIV"
		// Output: 444
		// Example 1:
		// Input: s = "MDCLXVI"
		// Output: 1666

		// 4 100
		// 4 tens
		// 4 ones
		//"CDXLIV"
		
	    HashMap<Integer, String> RomanNumeral = new HashMap<Integer, String>();
	    RomanNumeral.put(1,"I");	    
	    RomanNumeral.put(5,"V");
	    RomanNumeral.put(10,"X");
	    RomanNumeral.put(50,"L");
	    RomanNumeral.put(100,"C");
	    RomanNumeral.put(500,"D");
	    RomanNumeral.put(1000,"M");
	    
	    HashMap<String, String> fixmap = new HashMap<String, String>();
	    fixmap.put("IIII", "IV");
	    fixmap.put("VVVV", "VX");
	    fixmap.put("XXXX", "XL");
	    fixmap.put("LLLL", "LC");
	    fixmap.put("CCCC", "LC");
	    fixmap.put("CCCC", "CD");
	    fixmap.put("DDDD", "DM");
	    fixmap.put("MMMM", "DM");

	    
	    String returnvalue="";
	    if (input==1) {
	    returnvalue="".concat(RomanNumeral.get(1));
	    }   	
    	int nums[]= {1000,500,100,50,10,5,1};
    	System.out.println("Start Over");
		String substring="";
    	for (int x:nums) {
    		substring="";
    		for (int i=0;i<howmany(input,x);i++) {
    			substring=substring.concat(RomanNumeral.get(x));    			
    		}
    		if (substring.length() >3){
    			System.out.println(substring);
    			substring=fixmap.get(substring);
    		}
    		System.out.println(substring);
    		returnvalue=returnvalue.concat(substring);
    		System.out.println("Returnv"+returnvalue);
    		input=input-(howmany(input,x)*x);
    	}
    	System.out.println("");
    	System.out.println("End Over");
    	

		return returnvalue;			
    	
	}
	
	static int howmany(int value, int place) {
		return (value / place);
	}
}	
    	
    	
    	
    	
    	
    	
    	
	   
	   
	   
	   
	   

	    
	    
	    
    

