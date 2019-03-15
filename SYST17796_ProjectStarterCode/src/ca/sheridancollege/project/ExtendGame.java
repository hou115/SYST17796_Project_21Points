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
public class ExtendGame extends Game{
    public ExtendGame(String s){
        super(s);
    }
    public static void main(String[] args){
        ExtendGame newGame = new ExtendGame("Blackjack");
        //set Players to newGame Object, Players is an ArrayList
    }
    @Override
    public void play(){
    }
    @Override
    public void declareWinner(){
        
    }
}
