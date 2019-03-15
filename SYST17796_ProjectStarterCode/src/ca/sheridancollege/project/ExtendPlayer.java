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
public class ExtendPlayer extends Player {
    
    private int credit;
    
    public ExtendPlayer(String s, int n){
        super(s);
        this.credit = n;
    }
    
    public int getCredit(){
        return credit;
    }
    
    public void setCredit(int credit){
        this.credit = credit;
    }
    @Override
    public void play(){
    }
}
