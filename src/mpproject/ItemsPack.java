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
import javax.swing.ImageIcon;
import visitor.MyVisitor;

/**
 *
 * @author work
 */
public class ItemsPack implements Item{
    private List<Item> items;
    private String name;
    private Image img;

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
    
    
    
}
