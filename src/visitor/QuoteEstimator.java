/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.Iterator;
import java.util.LinkedList;
import mpproject.SportEvent;

/**
 *
 * @author work
 */
public abstract class QuoteEstimator implements MyVisitor<SportEvent>{
    private LinkedList<Double> quote;

    public QuoteEstimator() {
        quote = new LinkedList<>();
    }

    public Iterator<Double> getQuote() {
        return quote.iterator();
    }
    
    
    
    @Override
    public void visit(SportEvent m) {
        switch(m.getStatus()){
            case SportEvent.TO_PLAY: setToPlayQuote();
                                break;
            case SportEvent.PLAYING: setPlayingQuote();
                                break;
        }
    }
    
    public abstract void setToPlayQuote();
    public abstract void setPlayingQuote();
    
}
