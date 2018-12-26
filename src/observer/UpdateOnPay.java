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
import visitor.MyVisitor;
import visitor.SetUpCheckout;

/**
 *
 * @author work
 */
public class UpdateOnPay implements MyObserver<MyJFrame>{
    javax.swing.JPanel panel;
    private String code;

    public UpdateOnPay(javax.swing.JPanel panel, String code) {
        this.panel = panel;
        this.code = code;
    }
    
    @Override
    public void update(MyJFrame event, String... codes) {
        
        for(String c : codes){
           if(c.equals(this.code)){
               event.getUser().getCart().empty();
               MyVisitor v = new SetUpCheckout(this.panel,event);
               event.getUser().getCart().accept(v);
               event.getObserverRegister().notifyObservers(event, "total");
           }
       }
    }
    
}
