package com.methodindustries.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Day07HashmapTest {
    @Test
    public void testexamples()
    {	int[] nums1= {2,2,1};
    	int[] nums2= {4,1,2,1,2};
    	int[] nums3= {1};


    	
    	assertEquals(Day07Hashmap.singleNumber(nums1), 1);
    	assertEquals(Day07Hashmap.singleNumber(nums2), 4);
    	assertEquals(Day07Hashmap.singleNumber(nums3), 1);


    }
    
}
