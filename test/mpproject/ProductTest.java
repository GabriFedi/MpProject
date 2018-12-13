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
public class ProductTest {
    
    public ProductTest() {
    }
    
    
    @Before
    public void setUp() {
        
        Product p = new Product("cacio", 25.6,"333");
        assertEquals("cacio", p.getName());
    }
    
  

    @Test
    public void testGetPrice() {
         Product p = new Product("cacio", 25.6,"333");
         assertEquals(25.6 ,p.getPrice(),0.001);
    }

    @Test
    public void testSetPrice() {
        Product p = new Product("", 0.0,"333");
        p.setPrice(5.0);
        assertEquals(5.0 ,p.getPrice(),0.001);
    }

    @Test
    public void testGetDescr() {
       Product p = new Product("", 0.0,"333");
       p.setDescr("description");
       assertEquals("description",p.getDescr());

    }

    @Test
    public void testSetDescr() {
        Product p = new Product("", 0.0,"333");
       p.setDescr("description");
       assertEquals("description",p.getDescr());
    }
    
}
