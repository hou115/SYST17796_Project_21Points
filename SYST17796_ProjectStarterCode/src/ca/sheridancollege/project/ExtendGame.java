/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juntong
 */
public class ExtendGame extends Game{
    public ExtendGame(String s){
        super(s);
    }
    public static void main(String[] args){
        System.out.println("Welcome to play Blackjack");
        ExtendGame newGame = new ExtendGame("Blackjack");
        //set Players to newGame Object, Players is an ArrayList
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a name: ");
        String name = input.nextLine();
        ExtendPlayer newPlayer = new ExtendPlayer(name, 100);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(newPlayer);
        System.out.println("Welcome "+ newPlayer.getPlayerID()+". You have " + newPlayer.getCredit() + " credit.");
        newGame.play();
    }
    @Override
    public void play(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a bet (1 to 10):");
        int nbet = 0;
        boolean validNumber = false;
        while(!validNumber){
            try{
                String sbet = input.nextLine();
                nbet = Integer.parseInt(sbet);
                validNumber = true;
            }catch(Exception e){
                System.out.println("You have entered a invalid number. Please try again.");
            }
        }
        GroupOfCards gp = new GroupOfCards(52);
        
    }
    @Override
    public void declareWinner(){
        
    }
}
