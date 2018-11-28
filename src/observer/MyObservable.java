/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author work
 */
public interface MyObservable <T>{
    public void addObserver(MyObserver<T> o);
    public void removeObserver(MyObserver<T> o);
    public void notifyObservers(T event, String code);
}
