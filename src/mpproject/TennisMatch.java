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
public class TennisMatch extends SportEvent{

    public TennisMatch(Team opponent1, Team opponent2) throws IllegalArgumentException{
        super(opponent1,opponent2);
        if(opponent1.getPlayersNumber()>2)
            throw new IllegalArgumentException("The max number of team players in 2");
        
    }
    
    public TennisMatch(SinglePlayer opponent1, SinglePlayer opponent2) throws IllegalArgumentException{
        super(opponent1,opponent2);
    }
    
    
}
