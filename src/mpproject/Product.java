/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.awt.Image;
import visitor.MyVisitor;

/**
 *
 * @author work
 */
public class Product implements Item{
    private final String serialNumber;
    private final String name;
    private double price;
    private String descr;
    private Image img;
    private int qty;

    public Product(String name, double price, String serialNumber) {
        this.name = name;
        this.price = price;
        this.serialNumber = serialNumber;
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

    @Override
    public int getQty() {
        return this.qty;
    }

    @Override
    public void setQty(int i) {
        this.qty = i;
    }
    
    @Override 
    public boolean equals(Object o){
        if(! (o instanceof Product)){
            Product temp = (Product) o;
            return temp.getSerialNumber().equals(this.serialNumber);
        }
        return false;
    }
        
    

    @Override
    public String getSerialNumber() {
        return this.serialNumber;
    }
    
    @Override
    public String toString(){
        return ("Name: "+ this.getName() + "\n" + 
                "Price: " + this.getPrice()+ "\n");
    }
    
    
    
}
