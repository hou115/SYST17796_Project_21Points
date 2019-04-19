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
public class BetValidationTest {

    public BetValidationTest() {
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
     * Test of isBetInteger method, of class BetValidation.
     */
    @Test
    public void testIsBetIntegerGood() {
        System.out.println("isBetInteger");
        String bet = "1974";
        boolean expResult = true;
        boolean result = BetValidation.isBetInteger(bet);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsBetIntegerBad() {
        System.out.println("isBetInteger");
        String bet = "notanumber";
        boolean expResult = false;
        boolean result = BetValidation.isBetInteger(bet);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsBetIntegerBoundary() {
        System.out.println("isBetInteger");
        String bet = "0";
        boolean expResult = true;
        boolean result = BetValidation.isBetInteger(bet);
        assertEquals(expResult, result);
    }

    /**
     * Test of isBetMoreThanZero method, of class BetValidation.
     */
    @Test
    public void testIsBetMoreThanZeroGood() {
        System.out.println("isBetMoreThanZero");
        int bet = -50;
        boolean expResult = false;
        boolean result = BetValidation.isBetMoreThanZero(bet);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsBetMoreThanZeroBad() {
        System.out.println("isBetMoreThanZero");
        int bet = 100;
        boolean expResult = true;
        boolean result = BetValidation.isBetMoreThanZero(bet);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsBetMoreThanZeroBoundary() {
        System.out.println("isBetMoreThanZero");
        int bet = 0;
        boolean expResult = false;
        boolean result = BetValidation.isBetMoreThanZero(bet);
        assertEquals(expResult, result);
    }

    /**
     * Test of isCreditSufficient method, of class BetValidation.
     */
    @Test
    public void testIsCreditSufficientGood() {
        System.out.println("isCreditSufficient");
        int bet = 10;
        ExtendPlayer player = new ExtendPlayer("Tester", 100);
        boolean expResult = true;
        boolean result = BetValidation.isCreditSufficient(bet, player);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsCreditSufficientBad() {
        System.out.println("isCreditSufficient");
        int bet = 200;
        ExtendPlayer player = new ExtendPlayer("Tester", 100);
        boolean expResult = false;
        boolean result = BetValidation.isCreditSufficient(bet, player);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsCreditSufficientBoundary() {
        System.out.println("isCreditSufficient");
        int bet = 100;
        ExtendPlayer player = new ExtendPlayer("Tester", 100);
        boolean expResult = true;
        boolean result = BetValidation.isCreditSufficient(bet, player);
        assertEquals(expResult, result);
    }
}
