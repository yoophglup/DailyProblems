package com.methodindustries.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;


public class Day05Test 
{
	// Example 1:
	// Input: s = "the sky is blue"
	// Output: "blue is sky the"

	// Example 2:
	// Input: s = "  hello world  "
	// Output: "world hello"
	// Explanation: Your reversed string should not contain leading or trailing spaces.

	// Example 3:
	// Input: s = "a good   example"
	// Output: "example good a"
	// Explanation: You need to reduce multiple spaces between two words to a single
	// space in the reversed string.

	// Example 4:
	// Input: s = "  Bob    Loves  Alice   "
	// Output: "Alice Loves Bob"

	// Example 5:
	// Input: s = "Alice does not even like bob"
	// Output: "bob like even not does Alice"
	// Explanation: Please note capitalization.

	    @Test
	    public void Day04Test()
	    {
	    	
			char[] Test1= {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
			char[] answer1= {'b','l','u','e',' ','i','s',' ','s','k','y',' ','t','h','e'};





	 		assertTrue(Arrays.equals(answer1, Day05.ReverseWords(Test1)));



	    }
	    
	    
	}