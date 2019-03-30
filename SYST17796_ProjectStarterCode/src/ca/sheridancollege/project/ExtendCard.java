/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import ca.sheridancollege.project.Card.Suit;
import ca.sheridancollege.project.Card.Value;
/**
 *
 * @author Juntong
 */
public class ExtendCard extends Card{
    public ExtendCard(Suit s, Value gVal)
    {
        super(s,gVal);
    }
    
    public int getIntValue(){
        int n=0;
        if(this.getValue() != null){
            switch (this.getValue()) {
            case ACE:
                n=10;
                break;
            case TWO:
                n=2;
                break;
            case THREE:
                n=3;
                break;
            case FOUR:
                n=4;
                break;
            case FIVE:
                n=5;
                break;
            case SIX:
                n=6;
                break;
            case SEVEN:
                n=7;
                break;
            case EIGHT:
                n=8;
                break;
            case NINE:
                n=9;
                break;
            case TEN:
                n=10;
                break;
            case JACK:
                n=10;
                break;
            case QUEEN:
                n=10;
                break;
            case KING:
                n=10;
                break;
            default:
                break;
            }
        }
        return n;
    }

        
    @Override
    public String toString(){
        return getSuit()+" "+getValue();
    }
}
