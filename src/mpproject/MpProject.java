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
public class MpProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Team t = new Team("prova");
        Team t2 = new Team("prova");
        Player p1 = new Player("zineb",1);
        Player p2 = new Player("zineb",2);
        t.addPlayer(p1);
        t.addPlayer(p2);
        t2.addPlayer(p1);
        t2.addPlayer(p2);
    }
    
}
