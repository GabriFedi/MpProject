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
    private boolean vantage;

    public TennisScore() {
        this.wonSets = 0;
        this.currentSetScore = 0;
        this.vantage = true;
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
        return wonSets == 6;
    }

    public boolean isVantage() {
        return vantage;
    }

    public void setVantage(boolean vantage) {
        this.vantage = vantage;
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

    @Override
    public void increase(int amount) throws IllegalArgumentException {
        throw new UnsupportedOperationException("The score increasing way is standard."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void increase() throws IllegalAccessException{
        if(this.currentSetScore == 0 || this.currentSetScore == 15){
            this.currentSetScore += 15;
        }
        else if(this.currentSetScore == 30){
            this.currentSetScore += 10;
        }
        else{
            if(this.vantage){
                this.wonSets ++;
                this.currentSetScore = 0;
            }
            else{
                throw new IllegalAccessException("Can.t win the game with false vantage");
            }
        }
    }

    
    
}
