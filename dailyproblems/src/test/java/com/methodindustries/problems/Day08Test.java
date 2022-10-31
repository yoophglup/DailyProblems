package com.methodindustries.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Day08Test {
@Test
public void testexamples() {

	String E1 = "leetcode";
	String E2 = "loveleetcode";
	String E3 = "aabb";
	
	assertEquals(Day08.singleLetter(E1), 0);
	assertEquals(Day08.singleLetter(E2), 2);
	assertEquals(Day08.singleLetter(E3), -1);


}

}
