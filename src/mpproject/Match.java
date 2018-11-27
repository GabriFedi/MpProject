/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

/**
 *
 * @author work
 */
public class Match {
    private Opponent opponent1;
    private Opponent opponent2;
    private String score;
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
        this.score = "0 - 0";
        this.status = TO_PLAY;
        if(observerRegister == null)
            observerRegister = new ObserverRegister<>();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
        observerRegister.notifyObservers(this, "0");
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
