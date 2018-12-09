/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

import myexceptions.OutOfMoneyException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author work
 */
public class DebitCardTest {
    
    public DebitCardTest() {
    }
    
  
    
   @Before
    public void setUp() {
        Throwable e = null;
        
        try{
            DebitCard istance = new  DebitCard("1234123412341234", "Antonino", "Cannavacciuolo", "12/04", "123");
        }catch(IllegalArgumentException exception){
            e = exception;
        }
        assertEquals(e, null);
        
        try{
            DebitCard istance = new  DebitCard("12341234123412341234", "Antonino", "Cannavacciuolo", "12/04", "123");
        }catch(IllegalArgumentException exception){
            e = exception;
        }
        assertTrue(e instanceof IllegalArgumentException);
    }
    

    @Test
    public void testPay() throws Exception {
        DebitCard istance = new  DebitCard("1234123412341234", "Antonino", "Cannavacciuolo", "12/04", "123");
        Throwable e = null;

        try{
            istance.pay(150);
        }catch(OutOfMoneyException exception){
            e = exception;
        }
         assertEquals(e, null);
         assertEquals(-50, istance.getBalance(),0.01);
         
        try{
            istance.pay(100);
        }catch(OutOfMoneyException exception){
            e = exception;
        }
        assertTrue(e instanceof OutOfMoneyException);
         
        
    }
    
}
