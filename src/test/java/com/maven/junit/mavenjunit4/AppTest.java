package com.maven.junit.mavenjunit4;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Before
	public void setUp() {
		System.out.print("inside setup method\n");
	}
	
	@Test
    public void testSum()
    {
       int expected = 8;
 	   int retrieved = App.sum(5,3);
 	   
 	   assertTrue(expected == retrieved);
 	   System.out.println("execution completed");
    }
    
	@Test
    public void testSum2()
    {
       int expected = 9;
 	   int retrieved = App.sum(5,4);
 	   
 	   assertFalse(expected != retrieved);
 	   System.out.println("execution completed");
    }
    
	@After
    public void tearDown() {
    	System.out.println("\nInside tear down method");
    }
}
