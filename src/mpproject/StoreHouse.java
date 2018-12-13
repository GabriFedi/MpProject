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
    private ObserverRegister<StoreHouse> register;

    public StoreHouse() {
        items = new LinkedList<>();
        register = new ObserverRegister();;
    }
    
    
    public ObserverRegister<StoreHouse> getRegister() {
        return register;
    }
    
    public void addItem(Item item){
        if(!items.contains(item)){
            items.add(item);
            
        }
        else{
            Item temp = items.get(items.indexOf(item));
            temp.setQty(temp.getQty() + item.getQty());
        }
    }
    
}
