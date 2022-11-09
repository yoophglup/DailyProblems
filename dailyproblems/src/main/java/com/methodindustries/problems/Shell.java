package com.methodindustries.problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Shell {
	public static void main(String args[]) {
			ArrayList <Integer> somename = new ArrayList<Integer>();
			ArrayList <Long> aname=new ArrayList<Long>();
			
			
			List<Integer> thname = Arrays.asList(1,2,3);
		
			HashMap<Integer,Integer> totals = new HashMap<Integer,Integer>();
		    ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    numbers.forEach( (n) -> { System.out.println(n); } );
		    int n=2;
		    
		    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		    Integer sum = integers.stream()
		      .collect(Collectors.summingInt(Integer::intValue));
		    
		    
		    
		  }
	    	
	    
	    
	    	
	
}