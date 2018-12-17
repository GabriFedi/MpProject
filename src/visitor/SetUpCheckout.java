/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mpproject.Cart;

/**
 *
 * @author work
 */
public class SetUpCheckout implements MyVisitor<Cart>{

    private DefaultTableModel model;
    

    public SetUpCheckout(JTable jTable) {
        model = (DefaultTableModel) jTable.getModel();

        
    }
    
    
    @Override
    public void visit(Cart obj) {
        Vector row = new Vector();
   
        model.addRow(row);
        obj.getItems().forEach(e -> {
            row.add(e.getImage());
            row.add(e.getPrice());
            row.add(e.getQty());
            row.removeAllElements();
           
        });
    }
    
}
