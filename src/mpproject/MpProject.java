/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import visitor.QuoteEstimatorMatch;

/**
 *
 * @author work
 */
public class MpProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SinglePlayer Player = new SinglePlayer("zizzopanizzo", 78, new TennisScore());
        SinglePlayer Player2 = new SinglePlayer("zizzocatizzo", 86, new TennisScore());
        
        SportEvent tennisMatch = new TennisMatch(Player,Player2);
        QuoteEstimatorMatch v = new QuoteEstimatorMatch();
        tennisMatch.accept(v);
        System.out.println(v.getQuote());
    }
    
}
