/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import card.Card;
import java.util.stream.Stream;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alessandro
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getAddress method, of class User.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        User instance = new User("test address");
        String expResult = "test address";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class User.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "new address";
        User instance = new User("test address");
        instance.setAddress(address);
        assertEquals(address, instance.getAddress());
    }

    /**
     * Test of getCart method, of class User.
     */
    @Test
    public void testGetCart() {
        System.out.println("getCart");
        User instance = new User("Test address");
        Cart result = instance.getCart();
        assertNotNull(result);
    }


   

    /**
     * Test of addCard method, of class User.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = new card.CreditCard("1234567891234567", "Test", "Test", "Test", "Test");
        User instance = new User("Test address");
        instance.addCard(card);
        assertEquals(1, instance.getCards().count());
    }

    /**
     * Test of getCards method, of class User.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        User instance = new User("Test address");
        Card card = new card.CreditCard("1234567891234567", "Test", "Test", "Test", "Test");
        instance.addCard(card);
        Stream<Card> result = instance.getCards();
        assertTrue(result.anyMatch(p -> p.equals(card)));
    }
    
}
