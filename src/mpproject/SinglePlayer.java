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
public class SinglePlayer extends Player{
    private Score score;

    public SinglePlayer(String name, double strenght, Score score) {
        super(name, strenght);
        this.score = score;
    }

   
    
}
