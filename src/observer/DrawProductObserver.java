/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import graphic.MyJFrame;
import mpproject.Item;

/**
 *
 * @author work
 */
public class DrawProductObserver implements MyObserver<Item>{
    private String code;
    private MyJFrame jFrame; 

    public DrawProductObserver(String code, MyJFrame jFrame) {
        this.code = code;
        this.jFrame = jFrame;
    }

    @Override
    public void update(Item event, String code) {
        if(this.code.equals(code))
            jFrame.drawNewProduct(event);
    }
    
}
