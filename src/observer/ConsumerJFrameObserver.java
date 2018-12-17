/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import graphic.MyJFrame;
import java.util.function.Consumer;
import mpproject.Item;

/**
 *
 * @author work
 */
public class ConsumerJFrameObserver implements MyObserver<Item>{
    
    private MyJFrame jFrame;
    private Consumer<MyJFrame> function;
    private String code; //Total Update;
    
    ConsumerJFrameObserver(MyJFrame jFrame,Consumer<MyJFrame> function){
        this.function = function;
        this.jFrame = jFrame;
        this.code = "UT";
    }

    @Override
    public void update(Item event, String... codes) {
        for(String c : codes){
           if(c.equals(this.code)){
               function.accept(jFrame);
               break;
           }
       }
    }
    
    
}
