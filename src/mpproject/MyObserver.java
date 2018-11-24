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
public interface MyObserver <T> {
    public void update(T event, String code);
}
