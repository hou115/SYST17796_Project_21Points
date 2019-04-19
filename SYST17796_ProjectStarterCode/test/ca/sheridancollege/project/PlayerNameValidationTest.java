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
public class PlayerNameValidationTest {

    public PlayerNameValidationTest() {
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
     * Test of isNameEmpty method, of class PlayerNameValidation.
     */
    @Test
    public void testIsNameEmptyGood() {
        System.out.println("isNameEmpty");
        String name = "";
        boolean expResult = true;
        boolean result = PlayerNameValidation.isNameEmpty(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNameEmptyBad() {
        System.out.println("isNameEmpty");
        String name = "Apple Pie";
        boolean expResult = false;
        boolean result = PlayerNameValidation.isNameEmpty(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsNameEmptyBoundary() {
        System.out.println("isNameEmpty");
        String name = "a";
        boolean expResult = false;
        boolean result = PlayerNameValidation.isNameEmpty(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of validateNameLength method, of class PlayerNameValidation.
     */
    @Test
    public void testValidateNameLengthGood() {
        System.out.println("validateNameLength");
        String name = "Sheridan College";
        boolean expResult = true;
        boolean result = PlayerNameValidation.validateNameLength(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidateNameLengthBad() {
        System.out.println("validateNameLength");
        String name = "1234567890123456789012345678901234";
        boolean expResult = false;
        boolean result = PlayerNameValidation.validateNameLength(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidateNameLengthBoundary() {
        System.out.println("validateNameLength");
        String name = "abcdefghijklmnopqrstuvwxyz1234";
        boolean expResult = true;
        boolean result = PlayerNameValidation.validateNameLength(name);
        assertEquals(expResult, result);
    }

}
