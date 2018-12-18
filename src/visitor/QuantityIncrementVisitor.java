/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import mpproject.Cart;
import mpproject.Item;
import mpproject.ItemsPack;
import mpproject.Product;

/**
 *
 * @author alessandro
 */
public class QuantityIncrementVisitor implements ItemVisitor{
    
    private int qtyIncrement;
    
    public QuantityIncrementVisitor(int qtyIncrement){
        this.qtyIncrement = qtyIncrement;
    }
  

    @Override
    public void visit(Product p) {
        p.setQty(qtyIncrement);
    }

    @Override
    public void visit(ItemsPack p) {
        p.setQty(qtyIncrement);    
    }
    
}
