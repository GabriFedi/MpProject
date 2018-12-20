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
public class ItemsPackTest {
    
    @Before
    public void setUp() {
        ItemsPack c = new ItemsPack("Envelope", "SerialTest");
        assertEquals(c.getItems().count(), 0);
        assertEquals("Envelope:",c.getName());
        
    }

    @Test
    public void testGetItems() {
       Product p = new Product("Name",0.0,"333");
       ItemsPack c = new ItemsPack("Envelope", "SerialTest");
       c.add(p);
       
       assertEquals(true, c.getItems().anyMatch(e -> e == p));
    }

    @Test
    public void testGetName() {
        ItemsPack c = new ItemsPack("Envelope", "SerialTest");
        System.out.print(c.getName());
        assertEquals("Envelope:", c.getName());
    }

    @Test
    public void testGetPrice() {
        Product p = new Product("Name",1.0,"333");
        Product t = new Product("Name",3.4, "333");
        ItemsPack c = new ItemsPack("Envelope", "SerialTest");
        c.add(p,t);
        assertEquals(c.getPrice(), 4.4, 0.001);
    }

    @Test
    public void testAdd() {
       Item p = new Product("Test", 100, "SerialTest");
       ItemsPack c = new ItemsPack("Envelope", "SerialTest");
       c.add(p);
       assertEquals(1, c.getItems().count());
    }

    @Test
    public void testEquals() {
        ItemsPack c = new ItemsPack("Envelope", "SerialTest");
        ItemsPack c1 = new ItemsPack("Envelope1", "SerialTest");
        System.out.println(c.getSerialNumber().equals(c1.getSerialNumber()));
        assertTrue(c.equals(c1));
    }
    
    @Test
    public void testClone(){
        Item c = new ItemsPack("Envelope", "SerialTest");
        Item c1 = c.clone();
        assertTrue(c.equals(c1));
    }
    
}
