/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import mpproject.Cart;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alessandro
 */
public class CartPriceVisitorTest {
    
    public CartPriceVisitorTest() {
    }
    
    @Before
    public void setUp() {
    }
    

    /**
     * Test of getPrice method, of class CartPriceVisitor.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        CartPriceVisitor instance = new CartPriceVisitor();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of visit method, of class CartPriceVisitor.
     */
    @Test
    public void testVisit() {
        System.out.println("visit");
        Cart obj = new Cart();
        mpproject.Item p = new mpproject.Product("Test", 100, "SerialTest");
        obj.addItem(p);
        CartPriceVisitor instance = new CartPriceVisitor();
        instance.visit(obj);
        assertEquals(100, instance.getPrice(), 0.01);
    }
    
}
