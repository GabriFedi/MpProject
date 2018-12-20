/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import mpproject.ItemsPack;
import mpproject.Product;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alessandro
 */
public class QuantityIncrementVisitorTest {
    
    public QuantityIncrementVisitorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    /**
     * Test of visit method, of class QuantityIncrementVisitor.
     */
    @Test
    public void testVisit_Product() {
        System.out.println("visit");
        Product p = new Product("Test", 100, "SerialTest");
        QuantityIncrementVisitor instance = new QuantityIncrementVisitor(1);
        instance.visit(p);
        assertEquals(2, p.getQty());
    }

    /**
     * Test of visit method, of class QuantityIncrementVisitor.
     */
    @Test
    public void testVisit_ItemsPack() {
        System.out.println("visit");
        ItemsPack p = new ItemsPack("Test", "SerialTest");
        QuantityIncrementVisitor instance = new QuantityIncrementVisitor(1);
        instance.visit(p);
        assertEquals(2, p.getQty());
    }
    
}
