/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import sale.DefaultSale;
import sale.PercentSale;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alessandro
 */
public class PercentSaleTest {
    
    public PercentSaleTest() {
    }
    
    
    
    @Before
    public void setUp() {
    }
    
    /**
     * Test of getDiscountedPrice method, of class PercentSale.
     */
    @Test
    public void testGetDiscountedPrice() {
        System.out.println("getDiscountedPrice");
        double price = 100.0;
        PercentSale instance = new PercentSale(new DefaultSale(),20);
        double expResult = 80.0;
        double result = instance.getDiscountedPrice(price);
        assertEquals(expResult, result, 0.01);
    }
    
}
