/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

import sale.Sale;

/**
 *
 * @author alessandro
 */
public abstract class AbstractDecSale implements Sale{
    Sale sale;
    
    public AbstractDecSale(Sale sale){
        this.sale = sale;
    }

    @Override
    public double getDiscountedPrice(double price){
        return sale.getDiscountedPrice(price);
    }
    
    
    
}
