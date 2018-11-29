/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

/**
 *
 * @author alessandro
 */
public class TennisScore implements Score,Comparable{
    private int wonSets;
    private int currentSetScore;

    public TennisScore(int wonSets, int currentSetScore) {
        this.wonSets = wonSets;
        this.currentSetScore = currentSetScore;
    }
    
    public void increaseScore(){
        if(currentSetScore < 30)
            currentSetScore += 15;
        else
            currentSetScore += 10;
    }
    
    public void increaseSet(){
        wonSets++;
        currentSetScore = 0;
    }
    
    public void resetScore(){
        currentSetScore = 0;
    }
    
    public void resetAllScores(){
        wonSets++;
        resetScore();
    }
    
    public boolean hasWon(){
        return wonSets == 3;
    }
    
    @Override
    public String getScore() {
        return toString(); 
    }

    @Override
    public int compareTo(Object t) {
        if(!(t instanceof TennisScore))
            throw new IllegalArgumentException("Cannot compare " + t.getClass() + " with TennisScore.");
        TennisScore ts = (TennisScore) t;
        return 1;
    }
    
    @Override
    public String toString(){
        return "" + wonSets + "-" + currentSetScore;
    }
    
}
