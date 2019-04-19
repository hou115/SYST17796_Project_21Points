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
public class YesOrNo {

    //private constructor to prevent creation of instance outside of this class
    private YesOrNo() {
    }

    //public method return true if yes, return false if no
    public static boolean isInputValid(String s) {
        if (s.compareToIgnoreCase("Y") == 0 || s.compareToIgnoreCase("N") == 0 || s.compareToIgnoreCase("YES") == 0 || s.compareToIgnoreCase("NO") == 0) {
            return true;
        } else {
            System.out.println("Please Enter y(es)/n(o).");
            return false;
        }
    }

    public static boolean continuee(String s) {
        if (s.compareToIgnoreCase("Y") == 0 || s.compareToIgnoreCase("YES") == 0) {
            return true;
        } else {
            return false;
        }
    }
}
