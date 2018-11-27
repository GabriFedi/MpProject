/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.util.LinkedList;


/**
 *
 * @author work
 * @param <T>
 */
public class ObserverRegister <T> implements MyObservable<T>{
    private LinkedList<MyObserver<T>> observers;

    public ObserverRegister() {
        this.observers = new LinkedList<>();
    }
    
    
    @Override
    public void addObserver(MyObserver<T> o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(MyObserver<T> o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(T event, String code) {
        observers.forEach(e -> e.update(event, code));
    }   
    
}
