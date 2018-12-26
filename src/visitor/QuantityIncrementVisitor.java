/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

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
        p.setQty(p.getQty()+qtyIncrement);
        if(p.getQty() <= 0)
            p.setQty(1);
    }

    @Override
    public void visit(ItemsPack p) {
        p.setQty(p.getQty()+qtyIncrement);
        if(p.getQty() <= 0)
            p.setQty(1);
    }
    
}
