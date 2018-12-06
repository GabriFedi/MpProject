/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.util.stream.Stream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import visitor.MyVisitor;

/**
 *
 * @author work
 */
public class ItemsPackTest {
    
    @Before
    public void setUp() {
        ItemsPack c = new ItemsPack("Envelope");
        assertEquals(c.getItems().count(), 0);
        assertEquals("Envelope:",c.getName());
        
    }

    @Test
    public void testGetItems() {
       Product p = new Product("Name",0.0);
       ItemsPack c = new ItemsPack("Envelope");
       c.add(p);
       
       assertEquals(true, c.getItems().anyMatch(e -> e == p));
    }

    @Test
    public void testGetName() {
        ItemsPack c = new ItemsPack("Envelope");
        System.out.print(c.getName());
        assertEquals("Envelope:", c.getName());
    }

    @Test
    public void testGetPrice() {
        Product p = new Product("Name",1.0);
        Product t = new Product("Name",3.4);
        ItemsPack c = new ItemsPack("Envelope");
        c.add(p,t);
        assertEquals(c.getPrice(), 4.4, 0.001);
    }

   /* @Test
    public void testAddItem() {
       
    }

    @Test
    public void testAccept() {
        
    }
    */
}
