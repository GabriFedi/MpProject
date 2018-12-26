/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import graphic.MyJFrame;
import javax.swing.JLabel;
import mpproject.User;
import visitor.CartPriceVisitor;

/**
 *
 * @author work
 */
public class UpdateTotalText implements MyObserver<MyJFrame>{
    
    private javax.swing.JLabel label;
    private String code;

    public UpdateTotalText(JLabel label, String code) {
        this.label = label;
        this.code = code;
    }
    
    @Override
    public void update(MyJFrame event, String... codes) {
        for(String c : codes){
           if(c.equals(this.code)){
               User u = event.getUser();
               CartPriceVisitor v = new CartPriceVisitor();
               u.getCart().accept(v);
               label.setText("Total: "+ v.getPrice() + "€");
               
           }
       }
    }
    
}
