/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.awt.Image;
import javax.swing.ImageIcon;
import visitor.MyVisitor;

/**
 *
 * @author work
 */
public class Product implements Item{
    private final String name;
    private double price;
    private String descr;
    private Image img;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
      public void setImg(Image img) {
        this.img = img;
    }
    

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getName() {
        return name;
    }

    @Override
    public void add(Item... items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accept(MyVisitor v) {
        v.visit(this);
    }

    @Override
    public Image getImage() {
        return img;
    }
    
    
    
    
}
