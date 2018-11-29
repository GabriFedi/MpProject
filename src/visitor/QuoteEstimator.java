/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import mpproject.Matchsoccer;

/**
 *
 * @author work
 */
public class QuoteEstimator implements MyVisitor<Matchsoccer>{
    private double quota1;
    private double quota2;
    private double quotaX;
    
    @Override
    public void visit(Matchsoccer m) {
    }
    
}
