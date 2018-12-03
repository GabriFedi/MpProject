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
public class Player implements Opponent{
    private final String name;
    private double strenght;


    public Player(String name, double strenght) throws IllegalArgumentException{
        this.name = name;
        if(strenght > 100 || strenght<=0)
            throw new IllegalArgumentException("Strength must be between 1 and 100");
        this.strenght = strenght;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getStrenght() {
        return strenght;
    }

    
    @Override
    public int getPlayersNumber() {
        return 1;
    }

    @Override
    public Score getScore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
    
    
}
