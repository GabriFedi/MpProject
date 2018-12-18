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
 * @author alessandro
 */
public class QuantityIncrementVisitor implements MyVisitor<Item>{
    
    private int qtyIncrement;
    
    public QuantityIncrementVisitor(int qtyIncrement){
        this.qtyIncrement = qtyIncrement;
    }
    
    @Override
    public void visit(Item obj) {
        obj.setQty(obj.getQty()+qtyIncrement);
        if(obj.getQty() == 0)
            obj.setQty(1);
    }
    
}
