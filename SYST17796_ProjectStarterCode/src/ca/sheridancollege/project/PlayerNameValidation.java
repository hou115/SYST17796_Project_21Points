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
public class PlayerNameValidation {

    //private constructor to prevent creation of instance outside of this class
    private PlayerNameValidation() {
    }

    //public method validate empty
    public static boolean isNameEmpty(String name) {
        if (name.compareTo("") == 0) {
            System.out.println("Name cannot be empty. Please try again.");
            return true;
        } else {
            return false;
        }
    }

    //public method validate length no more than 30 character
    public static boolean validateNameLength(String name) {
        if (name.length() > 30) {
            System.out.println("Name cannot exceed 30 characters. Please try again.");
            return false;
        } else {
            return true;
        }
    }
}
