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
public class GetQtyVisitorTest {
    
    public GetQtyVisitorTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of visit method, of class GetQtyVisitor.
     */
    @Test
    public void testVisit_Product() {
        System.out.println("visit");
        Product p = new Product("Test", 100, "SerialTest");
        GetQtyVisitor instance = new GetQtyVisitor();
        instance.visit(p);
        assertEquals(1, p.getQty());
        p.setQty(100);
        instance.visit(p);
        assertEquals(100, p.getQty());
    }

    /**
     * Test of visit method, of class GetQtyVisitor.
     */
    @Test
    public void testVisit_ItemsPack() {
        System.out.println("visit");
        ItemsPack p = new ItemsPack("Test", "SerialTest");
        GetQtyVisitor instance = new GetQtyVisitor();
        instance.visit(p);
        assertEquals(1, p.getQty());
        p.setQty(100);
        instance.visit(p);
        assertEquals(100, p.getQty());
    }

    /**
     * Test of getQty method, of class GetQtyVisitor.
     */
    @Test
    public void testGetQty() {
        System.out.println("getQty");
        GetQtyVisitor instance = new GetQtyVisitor();
        int expResult = 0;
        int result = instance.getQty();
        assertEquals(expResult, result);
    }
    
}
