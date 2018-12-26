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
public class UpdateButtonTotalText implements MyObserver<MyJFrame>{
     
    private javax.swing.JButton button;
    private String code;

    public UpdateButtonTotalText(javax.swing.JButton button, String code) {
        this.button = button;
        this.code = code;
    }
    
    @Override
    public void update(MyJFrame event, String... codes) {
        for(String c : codes){
           if(c.equals(this.code)){
               User u = event.getUser();
               CartPriceVisitor v = new CartPriceVisitor();
               u.getCart().accept(v);
               button.setText("Total: "+ v.getPrice() + "€");
               
           }
       }
    }
    
}
