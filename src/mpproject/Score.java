/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

/**
 *
 * @author alessandro
 */
public interface Score {
    public String getScore();
    public void increase() throws IllegalAccessException;
    public void increase(int amount) throws IllegalArgumentException;
}
