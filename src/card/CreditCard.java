/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

import card.Card;
import myexceptions.OutOfMoneyException;

/**
 *
 * @author work
 */
public class CreditCard extends Card{

    public CreditCard(String number, String firstname, String lastname, String expiring, String securityCode) {
        super(number, firstname, lastname, expiring, securityCode);
    }

    @Override
    public void pay(double amount) throws OutOfMoneyException {
        if(this.getBalance()<amount)
            throw new OutOfMoneyException("Balance is not enough for this transaction");
        removeFromBalance(amount);
    }
    
}
