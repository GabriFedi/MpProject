/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import observer.ObserverRegister;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alessandro
 */
public class StoreHouseTest {
    
    public StoreHouseTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    /**
     * Test of getRegister method, of class StoreHouse.
     */
    @Test
    public void testGetRegister() {
        System.out.println("getRegister");
        StoreHouse instance = new StoreHouse();
        ObserverRegister<Item> result = instance.getRegister();
        assertNotNull(result);
    }

    /**
     * Test of addItem method, of class StoreHouse.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Item item = new Product("Test", 100, "SerialTest");
        StoreHouse instance = new StoreHouse();
        instance.addItem(item);
    }
    
}
