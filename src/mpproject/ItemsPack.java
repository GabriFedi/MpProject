/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.awt.Image;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import visitor.MyVisitor;

/**
 *
 * @author work
 */
public class ItemsPack implements Item{
    private String serialNumber;
    private List<Item> items;
    private String name;
    private Image img;
    private int qty;

    public ItemsPack(String name) {
        this.name = name;
        items  = new LinkedList<>();
    }

    public Stream<Item> getItems() {
        return items.stream();
    }

    public String getName() {
        String packName = name + ":";
        for(Item i : items){
            packName += ("\n " +i.getName());
        }
        return packName;
    }
    
    
    @Override
    public double getPrice() {
        return getItems().mapToDouble(Item::getPrice).sum();
    }

    @Override
    public void add(Item... items) {
        for(Item i : items)
            this.items.add(i);
    }
    

    @Override
    public void accept(MyVisitor v) {
        getItems().forEach(e -> v.visit(e));
    }   

    @Override
    public Image getImage() {
        return img;
    }

    @Override
    public int getQty() {
        return this.qty;
    }

    @Override
    public void setQty(int i) {
        this.qty = i;
    }
    
    @Override
    public String getSerialNumber() {
        return this.serialNumber;
    }
    
     @Override 
    public boolean equals(Object o){
        if(! (o instanceof ItemsPack)){
            ItemsPack temp = (ItemsPack) o;
            return temp.getSerialNumber().equals(this.serialNumber);
        }
        return false;
    }
    
    @Override
    public String toString(){
        String str = "";
        for(Item e : items)
            str += e.toString();
        return str;
    }

    @Override
    public Item clone() {
        ItemsPack newItemPack = new ItemsPack(name);
        getItems().forEach(e->{
            newItemPack.add(e.clone());
        });
        return newItemPack;
    }
}
