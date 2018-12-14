/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.util.LinkedList;
import observer.ObserverRegister;

/**
 *
 * @author work
 */
public class StoreHouse{
    
    private LinkedList<Item> items;
    private ObserverRegister<Item> register;

    public StoreHouse() {
        items = new LinkedList<>();
        register = new ObserverRegister();
    }
    
    
    public ObserverRegister<Item> getRegister() {
        return register;
    }
    
    public void addItem(Item item){
        if(!items.contains(item)){
            items.add(item);
            register.notifyObservers(item, "xxx");
        }
        else{
            Item temp = items.get(items.indexOf(item));
            temp.setQty(temp.getQty() + item.getQty());
        }
    }
    
}
