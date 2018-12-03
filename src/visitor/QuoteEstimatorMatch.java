/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.Iterator;
import java.util.LinkedList;
import mpproject.Opponent;
import mpproject.SportEvent;

/**
 *
 * @author work
 */
public abstract class QuoteEstimatorMatch extends QuoteEstimator{

    @Override
    public void setToPlayQuote(SportEvent s) {
        LinkedList<Double> quote = this.getQuote();
        Iterator<Opponent> opponens = s.getOpponents();
        Opponent opponent1 = opponens.next();
        Opponent opponent2 = opponens.next();
        double delta = opponent1.getStrenght() - opponent2.getStrenght();
        
        if(delta < 0){
            quote.add(2.);
            quote.add(1.2);
            quote.add(1.5);
        }
        else if(delta > 0){
            quote.add(1.2);
            quote.add(2.);
            quote.add(1.5);
        }
        else{
            quote.add(1.5);
            quote.add(1.5);
            quote.add(1.);
        }
        
    }
    
}
