/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import javax.swing.JTable;
import mpproject.Cart;

/**
 *
 * @author work
 */
public class SetUpCheckout implements MyVisitor<Cart>{

    private javax.swing.JTable jTable;

    public SetUpCheckout(JTable jTable) {
        this.jTable = jTable;
    }
    
    
    @Override
    public void visit(Cart obj) {
        obj.getItems().forEach(e -> {
           
        });
    }
    
}
