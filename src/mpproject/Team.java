/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.util.LinkedList;
import java.util.stream.Stream;

/**
 *
 * @author work
 */
public class Team implements Opponent{
    private final String name;
    private LinkedList<Opponent> players;
    private Score score;

    public Team(String name, Score score) {
        this.name = name;
        players = new LinkedList<>();
        this.score = score;
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Opponent o){
        players.add(o);
    }
    
    public Stream<Opponent> getPlayers(){
        return players.stream();
    }
    
    @Override
    public double getStrenght(){
        return getPlayers().mapToDouble(Opponent::getStrenght).sum();
    }
    
    @Override
    public int getPlayersNumber(){
        return getPlayers().mapToInt(Opponent::getPlayersNumber).sum();
    }

    public Score getScore() {
        return score;
    }
    
    

    
}

