/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.Iterator;
import mpproject.Opponent;
import mpproject.Score;
import mpproject.SportEvent;

/**
 *
 * @author work
 */
public class QuoteEstimatorTennis extends QuoteEstimatorMatch{

    @Override
    public void setPlayingQuote(SportEvent s) {
        Iterator<Opponent> opponents =  s.getOpponents();
        Opponent opponent1 = opponents.next();
        Opponent opponent2 = opponents.next();
        
        Score score1 = opponent1.getScore();
        Score score2 = opponent2.getScore();
        
        
        
    }
    
}
