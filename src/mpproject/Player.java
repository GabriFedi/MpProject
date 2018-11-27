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

    public Player(String name, double strenght) {
        this.name = name;
        this.strenght = strenght;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getStrenght() {
        return strenght;
    }

    public void setStrenght(double strenght) {
        this.strenght = strenght;
    }

    @Override
    public int getPlayersNumber() {
        return 1;
    }
    
    
    
}
