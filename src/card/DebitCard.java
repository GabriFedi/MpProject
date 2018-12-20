/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

import myexceptions.OutOfMoneyException;

/**
 *
 * @author work
 */
public class DebitCard extends Card{

    public static final double THRESHOLD = -100;
    public DebitCard(String number, String firstname, String lastname, String expiring, String securityCode) {
        super(number, firstname, lastname, expiring, securityCode);
    }

    
    @Override
    public void pay(double amount) throws OutOfMoneyException {
        if(this.getBalance()-amount <= THRESHOLD)
            throw new OutOfMoneyException("Transaction exceeds threshold of debt");
        this.removeFromBalance(amount);
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof DebitCard){
            DebitCard temp = (DebitCard)o;
            return temp.getNumber().equals(getNumber());
        }
        return false;
    }
    
    
    
    
}
