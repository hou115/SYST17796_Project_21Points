/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
import ca.sheridancollege.project.Card.Value;
/**
 *
 * @author Juntong
 */
public class CardsInHand {
    private ArrayList <ExtendCard> cards;
    boolean isComputer;
    public CardsInHand(boolean isComputer){
        this.isComputer = isComputer;
        cards = new ArrayList<>();
}
    public ArrayList<ExtendCard> showCards()
    {
        return cards;
    }
    public void cardIn(ExtendCard card){
        cards.add(card);
    }
    public void cardClear(){
        cards.clear();
    }
    public int cardSum(){
        int sum=0;
        int countAce = 0;
        //sum the total value
        for(int i=0;i<cards.size();i++){
            sum+=cards.get(i).getIntValue();
            if(cards.get(i).getValue() == Value.ACE){
                countAce++;
            }
        }
        //Ace can either be count as 10 or as 1 if sum exceeds 21
        for(int j=0;j<countAce;j++){
            if(sum>21){
                sum-=9;
            }
        }
        return sum;
    }
    public String toString2(){
        String s="";
        for(int i=0;i<cards.size();i++){
            s += cards.get(i).toString() +" ";
        }
        return s;
    }
    @Override
    public String toString(){
        String s="";
        if(isComputer){
            s += "* ";
            for(int i=1;i<cards.size();i++){
            s += cards.get(i).toString() +" ";
        }
        }else{
            for(int i=0;i<cards.size();i++){
            s += cards.get(i).toString() +" ";
        }
        }

        return s;
    }
}
