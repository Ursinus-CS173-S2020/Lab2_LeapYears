/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_leapyears;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ctralie
 */
public class Lab2_LeapYearsTest {
    
    public Lab2_LeapYearsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test the year 2000, which is a leap year since
     * it's a centennial divisible by 400
     */
    @Test
    public void testTrueLeapYear1() {
        int year = 2000;
        boolean expResult = true;
        boolean result = Lab2_LeapYears.isALeapYear(year);
        assertEquals(expResult, result);
    }

    /**
     * Test the year 1988, which is a leap year since
     * it's divisible by 4
     */
    @Test
    public void testTrueLeapYear2() {
        int year = 1988;
        boolean expResult = true;
        boolean result = Lab2_LeapYears.isALeapYear(year);
        assertEquals(expResult, result);
    }
    
    /**
     * Test the year 2019, which is not a leap year, 
     * since it's not divisible by 4
     */
    @Test
    public void testNotLeapYear1() {
        int year = 2019;
        boolean expResult = false;
        boolean result = Lab2_LeapYears.isALeapYear(year);
        assertEquals(expResult, result);
    }
    
    /**
     * Test the year 2100, which is not a leap year, 
     * since it's a centennial not divisible by 400
     */
    @Test
    public void testNotLeapYear2() {
        int year = 2100;
        boolean expResult = false;
        boolean result = Lab2_LeapYears.isALeapYear(year);
        assertEquals(expResult, result);
    }
}
