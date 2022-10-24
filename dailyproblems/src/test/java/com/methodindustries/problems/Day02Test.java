package com.methodindustries.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Day02Test 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void testexamples()
    {
 		char[] e1 = {'h','e','l','l','o'};
 		char[] e2 = {'H','a','n','n','a','h'};
    	assertEquals(Day02.run(e1), "olleh");
    	assertEquals(Day02.run(e2), "hannaH");
    }
    
}
