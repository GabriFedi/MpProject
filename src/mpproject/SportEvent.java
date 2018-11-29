/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.util.LinkedList;
import observer.ObserverRegister;
import visitor.MyVisitor;

/**
 *
 * @author work
 */
public abstract class SportEvent{
    private LinkedList<Opponent> opponents;
    private int status;
    public static ObserverRegister<SportEvent> observerRegister;
    
    public static final int TO_PLAY=0;
    public static final int PLAYING=1;
    public static final int FINISHED=2;

    public SportEvent(Opponent... opponents )throws IllegalArgumentException{
        int playersNumbers = opponents[0].getPlayersNumber();
        this.opponents = new LinkedList<>();
        for(Opponent o : opponents){
            if(o.getPlayersNumber()!=playersNumbers)
                throw new IllegalArgumentException("The opponents must have the same number of players");
            this.opponents.add(o);
        }
        
        this.status = TO_PLAY;
        if(observerRegister == null)
            observerRegister = new ObserverRegister<>();
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
