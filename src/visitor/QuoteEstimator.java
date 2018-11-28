/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import mpproject.Match;

/**
 *
 * @author work
 */
public class QuoteEstimator implements MyVisitor<Match>{
    private double quota1;
    private double quota2;
    private double quotaX;
    
    @Override
    public void visit(Match m) {
       double strenght1 = m.getOpponent1().getStrenght();
       double strenght2 = m.getOpponent2().getStrenght();
       
    }
    
}
