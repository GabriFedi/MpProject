/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import sale.DefaultSale;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alessandro
 */
public class DefaultSaleTest {
    
    public DefaultSaleTest() {
    }
    
    @Before
    public void setUp() {
    }
    

    /**
     * Test of getDiscountedPrice method, of class DefaultSale.
     */
    @Test
    public void testGetDiscountedPrice() {
        System.out.println("getDiscountedPrice");
        double price = 0.0;
        DefaultSale instance = new DefaultSale();
        double expResult = 0.0;
        double result = instance.getDiscountedPrice(price);
        assertEquals(expResult, result, 0.0);
    }
    
}
