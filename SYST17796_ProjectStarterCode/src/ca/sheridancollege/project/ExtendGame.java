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
    private int winner;
    public ExtendGame(String s){
        super(s);
    }
    public static void main(String[] args){
        ExtendGame newGame = reg();
        boolean anotherPlay = true;
        do{
            newGame.play();
            System.out.print("Do you want to play again?");
            Scanner input = new Scanner(System.in);
            String s_AnotherPlay;
            do{
                s_AnotherPlay = input.nextLine();
                if(s_AnotherPlay.compareToIgnoreCase("Y")==0||s_AnotherPlay.compareToIgnoreCase("YES")==0){
                    anotherPlay = true;
                }else{
                    anotherPlay = false;
                }
            }
            while(!(s_AnotherPlay.compareToIgnoreCase("Y")==0||s_AnotherPlay.compareToIgnoreCase("N")==0||s_AnotherPlay.compareToIgnoreCase("YES")==0||s_AnotherPlay.compareToIgnoreCase("NO")==0));
        
        }while(anotherPlay);
        System.out.println("Thanks for playing.\nDelevoped by Juntong Hou, Boqian Wen.");
        System.exit(0); 
    }
    public static ExtendGame reg(){
        System.out.println("Welcome to play Blackjack");
        ExtendGame newGame = new ExtendGame("Blackjack");
        //set Players to newGame Object, Players is an ArrayList
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a name: ");
        String name;
        do{
            name = input.nextLine();
            //remove leading and trailing spaces, so if spaces only, name will be empty
            name = name.trim();
            if(name.compareTo("")==0){
                System.out.println("Name cannot be empty. Please try again.");
            }
            if(name.length()>30){
                System.out.println("Name cannot exceed 30 characters. Please try again.");
            }
        }while(name.compareTo("")==0||name.length()>30);
        ExtendPlayer newPlayer = new ExtendPlayer(name, 100);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(newPlayer);
        newGame.setPlayers(players);
        return newGame;
    }
    @Override
    public void play(){
        Player pl = this.getPlayers().get(0);
        ExtendPlayer ex = (ExtendPlayer)pl;
        System.out.println("Welcome "+ ex.getPlayerID()+". You have " + ex.getCredit() + " credit.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a bet:");
        int nbet = 0;
        boolean validNumber = false;
        while(!validNumber || nbet<=0 || nbet>ex.getCredit()){
            try{
                String sbet = input.nextLine();
                nbet = Integer.parseInt(sbet);
                validNumber = true;
                if(nbet<=0){
                    System.out.println("Bet must be more than 1. Please try again.");
                }else if(nbet>ex.getCredit()){
                    System.out.println("Sorry, you do not have that much credit. Please try again.");
                }
            }catch(Exception e){
                System.out.println("You have entered a invalid number. Please try again.");
            }
        }
        //initialize 52 cards
        GroupOfCards gp = new GroupOfCards(52);
        //shuffle cards
        gp.shuffle();
        int cardIndex = 0;
        //initialize 2 sets of CardsInHand
        CardsInHand ch1 = new CardsInHand(true);
        CardsInHand ch2 = new CardsInHand(false);
        //deliver cards
        ch2.cardIn(gp.showCards().get(cardIndex++));
        ch1.cardIn(gp.showCards().get(cardIndex++));
        ch2.cardIn(gp.showCards().get(cardIndex++));
        ch1.cardIn(gp.showCards().get(cardIndex++));
        //ask user if he/she want one more card
        boolean isUserContinue = true;
        while(isUserContinue){
            //display current Card in hands
            System.out.print("Computer: "+ch1.toString()+"\n");
            System.out.print("You: "+ch2.toString()+" Total: "+ch2.cardSum()+"\n");
            System.out.print("Do you want one more card, Yes or No?");
            String response="";
            do{        
                response = input.nextLine();
                if(response.compareToIgnoreCase("Y")==0||response.compareToIgnoreCase("YES")==0){
                    isUserContinue = true;
                    ch2.cardIn(gp.showCards().get(cardIndex++));
                }else{
                    isUserContinue = false;
                }
            }
            while(!(response.compareToIgnoreCase("Y")==0||response.compareToIgnoreCase("N")==0||response.compareToIgnoreCase("YES")==0||response.compareToIgnoreCase("NO")==0));
            //check if user is busted after deliver one more card
            if(ch2.cardSum()>21){
                break;
            }
        }
            //User choose not to continue or user is busted
            //0 for computer, 1 for user
            if(ch2.cardSum()<=21){
                while(ch1.cardSum()<=15){
                ch1.cardIn(gp.showCards().get(cardIndex++));
                }
                winner = decideWinner(ch1,ch2);
            }else{
                winner = decideWinner(ch1,ch2);
            }
            System.out.print("Computer: "+ch1.toString2()+" Total: "+ch1.cardSum()+"\n");
            System.out.print("You: "+ch2.toString()+" Total: "+ch2.cardSum()+"\n");
            if(winner == 0){
                ex.setCredit(ex.getCredit()-nbet);
            }else{
                ex.setCredit(ex.getCredit()+nbet);
            }
            declareWinner();
            //Round over, clear out
            ch1.cardClear();
            ch2.cardClear();
            //check if user lost all the credit
            if(ex.getCredit()<=0){
                System.out.println("You lost all your credit.\nGame Over!\nThanks for playing.\nDelevoped by Juntong Hou, Boqian Wen.");
                System.exit(0);
            }
    }
    public int decideWinner(CardsInHand ch1, CardsInHand ch2){
        if(ch2.cardSum()>21){
            return 0;
        }else if(ch1.cardSum()>21){
            return 1;
        }else if(ch1.cardSum()>=ch2.cardSum()){
            return 0;
        }else{
            return 1;
        }
    }
    @Override
    public void declareWinner(){
        if(winner == 0){
            System.out.println("You lose.");
        }else{
            System.out.println("You Win!");
        }
    }
}
