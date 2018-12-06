/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myexceptions;

/**
 *
 * @author work
 */
public class OutOfMoneyException extends Exception{
    public OutOfMoneyException(String errorMessage){
        super(errorMessage);
    }
}
