package com.methodindustries.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Day06Test {
	    @Test
	    public void testexamples()
	    {
	 
	    	assertEquals(Day06.romanToInt("MDCLXVI"), 1666);
	    	assertEquals(Day06.romanToInt("CDXLIV"), 444);
	    	assertEquals(Day06.romanToInt("CMXCIX"), 999);

	    }
	    
	}
