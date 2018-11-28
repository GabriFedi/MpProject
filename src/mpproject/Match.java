/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import observer.ObserverRegister;
import visitor.MyVisitor;

/**
 *
 * @author work
 */
public class Match {
    private Opponent opponent1;
    private Opponent opponent2;
    private int score1;
    private int score2;
    private int status;
    public static ObserverRegister<Match> observerRegister;
    
    public static final int TO_PLAY=0;
    public static final int PLAYING=1;
    public static final int FINISHED=2;

    public Match(Opponent opponent1, Opponent opponent2) throws IllegalArgumentException{
        if(opponent1.getPlayersNumber() != opponent2.getPlayersNumber())
            throw new IllegalArgumentException("The opponents must have the same number of players");
        this.opponent1 = opponent1;
        this.opponent2 = opponent2;
        this.score1 = 0;
        this.score2 = 0;
        this.status = TO_PLAY;
        if(observerRegister == null)
            observerRegister = new ObserverRegister<>();
    }

    

    public void setScore1(int score1) {
        this.score1 = score1;
        observerRegister.notifyObservers(this, "0");
    }
    
    public void setScore2(int score2) {
        this.score2 = score2;
        observerRegister.notifyObservers(this, "0");
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public Opponent getOpponent1() {
        return opponent1;
    }

    public Opponent getOpponent2() {
        return opponent2;
    }
    
    
    

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
        observerRegister.notifyObservers(this, "0");
    }
    
    
    public void accept(MyVisitor v){
        v.visit(this);
    }
    
    
}
