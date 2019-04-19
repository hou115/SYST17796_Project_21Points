/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juntong
 */
public class YesOrNoTest {
    
    public YesOrNoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isInputValid method, of class YesOrNo.
     */
    @Test
    public void testIsInputValidGood() {
        System.out.println("isInputValid");
        String s = "yes";
        boolean expResult = true;
        boolean result = YesOrNo.isInputValid(s);
        assertEquals(expResult, result);
    }
        @Test
    public void testIsInputValidBad() {
        System.out.println("isInputValid");
        String s = "asrgfgds";
        boolean expResult = false;
        boolean result = YesOrNo.isInputValid(s);
        assertEquals(expResult, result);
    }
        @Test
    public void testIsInputValidBoundary() {
        System.out.println("isInputValid");
        String s = "y";
        boolean expResult = true;
        boolean result = YesOrNo.isInputValid(s);
        assertEquals(expResult, result);
    }

    /**
     * Test of continuee method, of class YesOrNo.
     */
    @Test
    public void testContinueeGood() {
        System.out.println("continuee");
        String s = "Yes";
        boolean expResult = true;
        boolean result = YesOrNo.continuee(s);
        assertEquals(expResult, result);
    }
        @Test
    public void testContinueeBad() {
        System.out.println("continuee");
        String s = "No";
        boolean expResult = false;
        boolean result = YesOrNo.continuee(s);
        assertEquals(expResult, result);
    }
        @Test
    public void testContinueeBoundary() {
        System.out.println("continuee");
        String s = "Y";
        boolean expResult = true;
        boolean result = YesOrNo.continuee(s);
        assertEquals(expResult, result);
    }
    
}
