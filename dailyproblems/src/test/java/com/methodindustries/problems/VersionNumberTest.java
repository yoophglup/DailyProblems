package com.methodindustries.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class VersionNumberTest {
@Test
public void testexamples() {

	String E1a = "2.0.27";
	String E1b = "1.0.27";
	
	String E2a = "1.2.27";
	String E2b = "1.3.37";

	String E3a = "1.0.37.2.1";
	String E3b = "1";

	String E4a = "2";
	String E4b = "2.1.27";

	String E5a = "2.0.31";
	String E5b = "2.0.31";

	String E6a = "1.0.0";
	String E6b = "1.0";
	

	String E7a = "1.0.1";
	String E7b = "1.0";
	
	
	assertEquals(VersionsNumber.compare(E1a,E1b), Integer.valueOf(1));
	assertEquals(VersionsNumber.compare(E2a,E2b), Integer.valueOf(0));
	assertEquals(VersionsNumber.compare(E3a,E3b), Integer.valueOf(1));
	assertEquals(VersionsNumber.compare(E4a,E4b), Integer.valueOf(0));
	assertEquals(VersionsNumber.compare(E5a,E5b), Integer.valueOf(-1));
	assertEquals(VersionsNumber.compare(E6a,E6b), Integer.valueOf(-1));
	assertEquals(VersionsNumber.compare(E7a,E7b), Integer.valueOf(1));


}

}
