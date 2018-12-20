/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import org.junit.Before;
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
    
    @Test
    public void testEquals(){
        Product p = new Product("Test", 100, "SerialTest");
        Product p1 = new Product("Test1", 200, "SerialTest");
        assertTrue(p.equals(p1)); 
    }
    
    @Test
    public void testToString(){
        Product p = new Product("Test", 100, "SerialTest");
        String expResult = "Name: Test\nPrice: 100.0\n";
        assertTrue(p.toString().equals(expResult));
    }
    
    @Test
    public void testClone(){
        Product p = new Product("Test", 100, "SerialTest");
        Item p1 = p.clone();
        assertTrue(p.equals(p1));
    }
    
    @Test
    public void testGetName(){
        Product p = new Product("Test", 100, "SerialTest");
        assertEquals("Test", p.getName());
    }
    
    @Test
    public void testGetQty(){
        Product p = new Product("Test", 100, "SerialTest");
        assertEquals(1, p.getQty());
    }
    
    @Test
    public void testSetQty(){
        Product p = new Product("Test", 100, "SerialTest");
        p.setQty(100);
        assertEquals(100, p.getQty());
    }
    
    @Test
    public void testGetSerialNumber(){
        Product p = new Product("Test", 100, "SerialTest");
        assertEquals("SerialTest", p.getSerialNumber());
    }
}
