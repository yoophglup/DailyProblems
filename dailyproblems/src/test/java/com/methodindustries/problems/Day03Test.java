package com.methodindustries.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;


public class Day03Test 
{
    
    @Test
    public void TwoSumTest()
    {
    	

 		int[] numsTest1= {2,7,11,15};
 		int targetTest1=9;
 		int answer1[]= {0,1};

 		int[] numsTest2= {2,3,4};
 		int targetTest2=6;
 		int answer2[]= {0,2};

 		
 		int[] numsTest3= {3,3};
 		int targetTest3=6;
 		int answer3[]= {0,1};

 		assertTrue(Arrays.equals(answer1, TwoSum.run(numsTest1,targetTest1)));
 		assertTrue(Arrays.equals(answer2, TwoSum.run(numsTest2,targetTest2)));
 		assertTrue(Arrays.equals(answer3, TwoSum.run(numsTest3,targetTest3)));


    }
    
    
}
