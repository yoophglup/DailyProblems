package com.methodindustries.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;


public class Day04Test 
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
    	

 		String Test1= "the sky is blue";
 		String answer1= "blue is sky the";

 		String Test2=  "  hello world  ";
 		String answer2= "world hello";

 		String Test3= "a good   example";
 		String answer3= "example good a";

 		String Test4= "  Bob    Loves  Alice   ";
 		String answer4= "Alice Loves Bob";

 		String Test5= "Alice does not even like bob";
 		String answer5= "bob like even not does Alice";


 		assertEquals(Day04.reverseWords(Test1),answer1);
 		assertEquals(Day04.reverseWords(Test2),answer2);
 		assertEquals(Day04.reverseWords(Test3),answer3);
 		assertEquals(Day04.reverseWords(Test4),answer4);
 		assertEquals(Day04.reverseWords(Test5),answer5);


    }
    
    
}