/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mpproject.Cart;

/**
 *
 * @author work
 */
public class SetUpCheckout implements MyVisitor<Cart>{

    private javax.swing.JPanel panel;
    

    public SetUpCheckout(javax.swing.JPanel panel) {

        this.panel = panel;
        
    }

    public JPanel getPanel() {
        return panel;
    }
    
    
    
    
    @Override
    public void visit(Cart obj) {
   
        obj.getItems().forEach(e -> {
            javax.swing.JPanel newpanel = new javax.swing.JPanel();
            newpanel.setLayout(new javax.swing.BoxLayout(newpanel,javax.swing.BoxLayout.Y_AXIS));
            javax.swing.JLabel img = new javax.swing.JLabel();
            img.setIcon(new ImageIcon(e.getImage()));
            
            javax.swing.JLabel name = new javax.swing.JLabel();
            name.setText(e.getName());
            newpanel.add(name);
            newpanel.add(img);
            panel.add(newpanel);
        });
    }
    
}
