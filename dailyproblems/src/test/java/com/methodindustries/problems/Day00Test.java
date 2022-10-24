package com.methodindustries.problems;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Day00Test 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void multipleOfThreeShouldReturnFizz()
    {
    	assertEquals(Day00.fizz(1), false);
    	assertEquals(Day00.fizz(2), false);
        assertEquals(Day00.fizz(3), true );
    }
    @Test
    public void multipleOfFiveShouldReturnBuzz()
    {
    	assertEquals(Day00.buzz(1), false);
    	assertEquals(Day00.buzz(2), false);
    	assertEquals(Day00.buzz(3), false);
    	assertEquals(Day00.buzz(4), false);
        assertEquals(Day00.buzz(5), true );
    }
    @Test
    public void calculateShouldReturnCorrectString()
    {
    	Day00 FizzBuzz = new Day00();
    	assertEquals(FizzBuzz.calculate(0),"FizzBuzz");
    	assertEquals(FizzBuzz.calculate(4),"4");
    	assertEquals(FizzBuzz.calculate(3),"Fizz");
    	assertEquals(FizzBuzz.calculate(10),"Buzz");
    	assertEquals(FizzBuzz.calculate(15),"FizzBuzz");

    }
}


