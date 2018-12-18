/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mpproject.Cart;

/**
 *
 * @author work
 */
public class SetUpCheckout implements MyVisitor<Cart>{

    private javax.swing.JPanel panel;
    

    public SetUpCheckout(JPanel panel) {
        this.panel = panel;
    }

    public JPanel getPanel() {
        return panel;
    }
    
    @Override
    public void visit(Cart obj) {
   
        obj.getItems().forEach(e -> {
            JPanel newpanel = new JPanel();
            JButton buttonIncrement = new JButton("+");
            JButton buttonDecrement = new JButton("-");
            JButton buttonRemove = new JButton("Rimuovi");
            JLabel img = createLabelIcon(e.getImage());
            JLabel name = createLabel(e.getName());
            newpanel.setLayout(new javax.swing.BoxLayout(newpanel,BoxLayout.X_AXIS));
            
            buttonIncrement.addActionListener(l ->{
                e.accept(new QuantityIncrementVisitor(1));
            });
            buttonDecrement.addActionListener(l ->{
                e.accept(new QuantityIncrementVisitor(-1));
            });
            buttonRemove.addActionListener(l->{
                obj.removeItem(e);
            });
            
            newpanel.add(img);
            newpanel.add(Box.createRigidArea(new Dimension(10, 0)));
            newpanel.add(name);
            newpanel.add(Box.createRigidArea(new Dimension(10, 0)));
            newpanel.add(buttonIncrement);
            newpanel.add(Box.createRigidArea(new Dimension(10, 0)));
            newpanel.add(buttonDecrement);
            newpanel.add(Box.createRigidArea(new Dimension(10, 0)));
            newpanel.add(buttonRemove);
            newpanel.setBackground(Color.yellow);
            panel.add(newpanel);
            System.out.println(panel.getComponentCount());
        });
    }
    
    private JLabel createLabel(String labelText){
        JLabel name = new JLabel(labelText);
        name.setAlignmentX(Component.CENTER_ALIGNMENT);
        return name;
    }
    
    private JLabel createLabelIcon(Image icon){
        JLabel img = new JLabel();
        img.setIcon(new ImageIcon(icon));
        img.setAlignmentX(Component.CENTER_ALIGNMENT);
        return img;
    }
}
