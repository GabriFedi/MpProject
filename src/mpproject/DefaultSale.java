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
public class DefaultSale implements Sale{
    
    @Override
    public double getDiscountedPrice(double price) {
        return price;
    }
    
}
