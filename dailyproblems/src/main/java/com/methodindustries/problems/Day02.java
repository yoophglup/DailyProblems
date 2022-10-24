package com.methodindustries.problems;

/**
 * Hello world!
 *
 */
public class Day02 {
	 public static String run(char[] s) {
		 int t=0;
 		if (s.length % 2 ==0) {
 			t=s.length/2;
 		}else {
 			t=(s.length-1)/2;
 		}
 		
 		for (int i=0; i<t;i++) {
 			char tempchar=s[i];
 			
 			s[i]=s[s.length-1-i];
 			s[s.length-1-i]=tempchar;
 			
 		}

 		String returnstring=new String (s);
 		return returnstring;
 

 	}

	
}