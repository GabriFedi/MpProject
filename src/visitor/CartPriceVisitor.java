/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import mpproject.Cart;
import mpproject.Item;

/**
 *
 * @author work
 */
public class CartPriceVisitor implements MyVisitor<Cart>{
    double price;

    public CartPriceVisitor() {
        price = 0;
    }

    public double getPrice() {
        return price;
    }
    
    @Override
    public void visit(Cart obj) {
        price = obj.getProducts().mapToDouble(Item::getPrice).sum();
    }

   
    
}
