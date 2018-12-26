/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import card.Card;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author work
 */
public class User {
    
    private String address;
    private Cart cart;
    private List<Card> cards;

    public User(String address) {
        this.address = address;
        cart = new Cart();
        cards = new LinkedList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public Stream<Card> getCards() {
        return cards.stream();
    }
}
