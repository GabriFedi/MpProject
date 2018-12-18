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
public class SetQtyVisitor implements ItemVisitor{
    private int qty;
    
    public SetQtyVisitor(int qty){
        this.qty = qty;
    }
    
    @Override
    public void visit(Product p) {
        p.setQty(qty);
    }

    @Override
    public void visit(ItemsPack p) {
        p.setQty(qty);
    }
    
}
