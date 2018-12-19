/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

/**
 *
 * @author alessandro
 */
public abstract class AbstractDecSale implements Sale{
    Sale s;
    
    public AbstractDecSale(Sale s){
        this.s = s;
    }

    @Override
    public double getDiscountedPrice(double price){
        return s.getDiscountedPrice(price);
    }
    
    
    
}
