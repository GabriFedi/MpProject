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
public class GetQtyVisitor implements ItemVisitor{
    private int qty;
    
    @Override
    public void visit(Product p) {
        qty = p.getQty();
    }

    @Override
    public void visit(ItemsPack p) {
        qty = p.getQty();
    }
    
    public int getQty(){
        return qty;
    }
    
}
