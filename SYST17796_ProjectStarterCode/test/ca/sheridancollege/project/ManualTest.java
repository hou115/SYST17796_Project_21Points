/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class ManualTest {

    public ManualTest() {
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
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards(52);
        //Print unshuffled cards
        System.out.println("Unshuffled cards");
        for (int i = 0; i < instance.showCards().size(); i++) {
            instance.showCards().get(i).printCard();
        }
        instance.shuffle();
        //Print shuffled cards
        System.out.println("Shuffled cards");
        for (int i = 0; i < instance.showCards().size(); i++) {
            instance.showCards().get(i).printCard();
        }

    }

    /**
     * Test of getIntValue method, of class ExtendCard.
     */
    @Test
    public void testGetIntValue() {
        System.out.println("getIntValue");
        GroupOfCards instance = new GroupOfCards(52);
        //Print the 21 points counted value of the cards
        for (int i = 0; i < instance.showCards().size(); i++) {
            System.out.print(instance.showCards().get(i).getIntValue() + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    /**
     * Test of cardIn method, of class CardsInHand.
     */
    @Test
    public void testcardIn() {
        System.out.println("cardIn");
        GroupOfCards instance = new GroupOfCards(52);
        CardsInHand ch = new CardsInHand(false);
        ch.cardIn(instance.showCards().get(5));
        //should be HEARTS SIX
        ch.showCards().get(0).printCard();
    }

    /**
     * Test of cardClear method, of class CardsInHand.
     */
    @Test
    public void testcardClear() {
        System.out.println("cardIn");
        GroupOfCards instance = new GroupOfCards(52);
        CardsInHand ch = new CardsInHand(false);
        ch.cardIn(instance.showCards().get(5));
        //should raise an exception
        ch.cardClear();
        try {
            ch.showCards().get(0).printCard();
        } catch (Exception e) {
            System.out.println("CardsInHand is empty.");
        }
    }

    /**
     * Test of cardSum method, of class CardsInHand.
     */
    @Test
    public void testcardSum() {
        System.out.println("cardSum");
        GroupOfCards instance = new GroupOfCards(52);
        CardsInHand ch = new CardsInHand(false);
        //test sum from 2 to 9,should be 44
        for (int i = 1; i < 9; i++) {
            ch.cardIn(instance.showCards().get(i));
        }
        System.out.println(ch.cardSum());
        ch.cardClear();
        //test sum from 1 to 4,should be 19,since Ace is evaluated as 10 if sum is less than 21
        for (int i = 0; i < 4; i++) {
            ch.cardIn(instance.showCards().get(i));
        }
        System.out.println(ch.cardSum());
        ch.cardClear();
        //test sum from 1 to 5, should be 15, since Ace is evaluated as 1 if sum is more than 21
        for (int i = 0; i < 5; i++) {
            ch.cardIn(instance.showCards().get(i));
        }
        System.out.println(ch.cardSum());
        ch.cardClear();
        //test sum Jack, Queen and King, result should be 30, since they all evaluated as 10.
        for (int i = 10; i < 13; i++) {
            ch.cardIn(instance.showCards().get(i));
        }
        System.out.println(ch.cardSum());
        ch.cardClear();
    }
}
