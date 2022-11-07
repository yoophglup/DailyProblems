package com.methodindustries.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Day10Test {
@Test
public void testexamples() {


	String E1 = "bat";
	
	String E2 = "batt";
	String E3 = "bbatt";
	String E4 = "battt";

	// Example 1:
	// Input: s = "bat"
	// Output: YES

	// Example 2:
	// Input: s = "batt"
	// Output: YES


	// Example 3:
	// Input: s = "bbatt"
	// Output: NO

	// Example 4:
	// Input: s = "battt"
	// Output: NO
	
	assertEquals(Day10.isValid(E1), "YES");
	assertEquals(Day10.isValid(E2), "YES");
	assertEquals(Day10.isValid(E3), "NO");
	assertEquals(Day10.isValid(E4), "NO");

}

}
