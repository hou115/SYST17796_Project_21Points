/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Juntong
 */
public class BetValidation {
    //private constructor to prevent creation of instance outside of this class

    private BetValidation() {
    }

    //public method validate bet is a valid integer
    public static boolean isBetInteger(String bet) {
        try {
            int nbet = Integer.parseInt(bet);
            return true;
        } catch (Exception e) {
            System.out.println("You have entered a invalid number. Please try again.");
            return false;
        }
    }

    //public method validate bet is more than 0
    public static boolean isBetMoreThanZero(int bet) {
        if (bet > 0) {
            return true;
        } else {
            System.out.println("Bet must be more than 1. Please try again.");
            return false;
        }
    }

    //public method check if player has sufficient credit
    public static boolean isCreditSufficient(int bet, ExtendPlayer player) {
        if (bet <= player.getCredit()) {
            return true;
        } else {
            System.out.println("Sorry, you do not have that much credit. Please try again.");
            return false;
        }
    }
}
