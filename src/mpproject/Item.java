/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import visitor.MyVisitor;

/**
 *
 * @author work
 */
public interface Item {
    public double getPrice();
    public void addItem(Item a);
    public void accept(MyVisitor v);
}
