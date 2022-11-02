package com.methodindustries.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Day09Test {
@Test
public void testexamples() {


	String E1a = "anagram";
	String E1b = "nagaram";
	
	String E2a = "rat";
	String E2b = "car";


	
	assertEquals(Day09.isanagram(E1a,E1b), true);
	assertEquals(Day09.isanagram(E2a,E2b), false);


}

}
