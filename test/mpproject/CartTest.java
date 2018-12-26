/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import sale.DefaultSale;
import sale.Sale;
import java.util.Arrays;
import java.util.Collection;
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
 * @author alessandro
 */
public class CartTest {
    
    public CartTest() {
    }
    
    
    @Before
    public void setUp() {
    }

    /**
     * Test of addItem method, of class Cart.
     */
    @Test
    public void testAddItem() {
        Item p = new Product("Test", 1000, "SerialTest");
        Cart instance = new Cart();
        instance.addItem(p);
        assertEquals(1, instance.getItems().count());
        instance.addItem(p);
        assertEquals(1, instance.getItems().count());
        visitor.GetQtyVisitor v = new visitor.GetQtyVisitor();
        instance.getItems().findFirst().get().accept(v);
        double qty = v.getQty();
        assertEquals(2, qty, 0.01);
    }

    /**
     * Test of getSaleMethod method, of class Cart.
     */
    @Test
    public void testGetSaleMethod() {
        System.out.println("getSaleMethod");
        Cart instance = new Cart();
        Sale expResult = new DefaultSale();
        instance.setSaleMethod(expResult);
        Sale result = instance.getSaleMethod();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeItem method, of class Cart.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        Item p = new Product("Test", 1000, "SerialTest");
        Cart instance = new Cart();
        instance.addItem(p);
        instance.removeItem(p);
        assertEquals(0, instance.getItems().count());
    }

    /**
     * Test of setPaymentMethod method, of class Cart.
     */
    

    /**
     * Test of setSaleMethod method, of class Cart.
     */
    @Test
    public void testSetSaleMethod() {
        System.out.println("setSaleMethod");
        Sale saleMethod = new DefaultSale();
        Cart instance = new Cart();
        instance.setSaleMethod(saleMethod);
        assertEquals(saleMethod, instance.getSaleMethod());
    }

    /**
     * Test of getItems method, of class Cart.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        Cart instance = new Cart();
        Item p = new Product("Test", 100, "SerialTest");
        Collection<Item> collection = Arrays.asList(p, p);
        instance.addItem(p);
        instance.addItem(p);
        Stream<Item> expResult = collection.stream();
        Stream<Item> result = instance.getItems();
        assertTrue(result.allMatch(i-> i.equals(p)));
    }

    /**
     * Test of accept method, of class Cart.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        visitor.CartPriceVisitor v = new visitor.CartPriceVisitor();
        Cart instance = new Cart();
        instance.accept(v);
        assertEquals(0, v.getPrice(), 0.01);
        Item p = new Product("Test", 100, "SerialTest");
        instance.addItem(p);
        instance.accept(v);
        assertEquals(100, v.getPrice(), 0.01);
    }

    /**
     * Test of toString method, of class Cart.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cart instance = new Cart();
        String expResult = "";
        String result = instance.toString();
        Item p = new Product("Test", 100, "SerialTest");
        instance.addItem(p);
        assertEquals(p.toString(), instance.toString());
    }
    
}
