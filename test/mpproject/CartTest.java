/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

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
public class CartTest {
    
    public CartTest() {
    }
    
    
    @Before
    public void setUp() {
        Cart c = new Cart();
        assertNotEquals(c, null);
    }
 

    /*@Test
    public void testSetPaymentMethod() {
        System.out.println("setPaymentMethod");
        Payment paymentMethod = null;
        Cart instance = new Cart();
        instance.setPaymentMethod(paymentMethod);
        fail("The test case is a prototype.");
    }*/

   /* @Test
    public void testSetSaleMethod() {
        System.out.println("setSaleMethod");
        Sale saleMethod = null;
        Cart instance = new Cart();
        instance.setSaleMethod(saleMethod);
        fail("The test case is a prototype.");
    }*/

    @Test
    public void testGetPrice() {
        Cart instance = new Cart();
        Item p = new Product("cipolla", 5.0,"333");
        Item p1 = new Product("mandarancio", 6.1,"333");
        Item p3 = new Product("porro", 7.1,"33");
        
        Item pack = new ItemsPack("Frutta");
        pack.add(p,p1);
        instance.addItem(pack);
        instance.addItem(p3);
        
       // assertEquals(18.2, instance.getPrice(), 0.01);
    }

    /*@Test
    public void testPay() {
        System.out.println("pay");
        Cart instance = new Cart();
        boolean expResult = false;
        boolean result = instance.pay();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }*/

    /*@Test
    public void testToString() {
        System.out.println("toString");
        Cart instance = new Cart();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }*/
    
}
