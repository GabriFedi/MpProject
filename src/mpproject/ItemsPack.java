/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.util.LinkedList;
import java.util.stream.Stream;
import visitor.MyVisitor;

/**
 *
 * @author work
 */
public class ItemsPack implements Item{
    private LinkedList<Item> items;
    private String name;

    public ItemsPack(String name) {
        this.name = name;
        items  = new LinkedList<>();
    }

    public Stream<Item> getItems() {
        return items.stream();
    }

    public String getName() {
        return name;
    }
    
    
    @Override
    public double getPrice() {
        return getItems().mapToDouble(Item::getPrice).sum();
    }

    @Override
    public void addItem(Item p) {
        items.add(p);
    }
    

    @Override
    public void accept(MyVisitor v) {
        getItems().forEach(e -> v.visit(e));
    }   
    
    
    
}
