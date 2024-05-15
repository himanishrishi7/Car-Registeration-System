import static org.junit.Assert.*;
import org.junit.Test;

/**
 * File Name: CarRegisterationTest.java
 * Author: @author Himanish Rishi #041107547
 * Course: CST8284 - OOP
 * Assignment: Assignment 1
 * Date: January 25, 2024
 * Professor: Moshiur Rahman
 * */
/**
 * Junit test that checks if the method is correct
 */

public class CarRegistrationTest2 {
	
	/**
	 * Declaring variable
	 */

    private static final double EPSILON = 1E-12;

    /**
     * Main method that tests 
     */
    @Test 
    public void test() {
        CarRegistration c = new CarRegistration(200, 1, 400, null, null, null, 0, null, 600000);

        // Call the method that returns a string
        boolean result = c.isPreApproved(); 
        boolean expected = true; 

        // Check the returned string against the expected string
        assertEquals(expected, result);
    }
    
    @Test 
    //THIS TEST WILL FAIL BECAUSE THE VALUES OF EXPECTED AND RETURNED VALUE WON'T MATCH
    public void test2() {
        CarRegistration c = new CarRegistration(2000, 1, 600, null, null, null, 0, null, 5000);

        // Call the method that returns a string
        boolean result = c.isPreApproved(); 
        boolean expected = true; 

        // Check the returned string against the expected string
        assertEquals(expected, result);
    }
}

