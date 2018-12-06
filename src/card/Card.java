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
public abstract class Card{
    private String number;
    private String firstname;
    private String lastname;
    private String expiring;
    private String securityCode;
    
    private double balance;

    public Card(String number, String firstname, String lastname, String expiring, String securityCode) {
        this.number = number;
        this.firstname = firstname;
        this.lastname = lastname;
        this.expiring = expiring;
        this.securityCode = securityCode;
        
        balance = 100;
    }
    
    public double getBalance(){
        return balance;
    }

    protected void removeFromBalance(double amount) {
        this.balance -= amount;
    }
    
    public void addToBalance(double amount){
        this.balance += amount;
    }
    
    
    
    public abstract void pay(double amount) throws OutOfMoneyException;
    
}
