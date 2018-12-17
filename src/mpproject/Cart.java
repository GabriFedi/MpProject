/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import visitor.MyVisitor;

/**
 *
 * @author work
 */
public class Cart {
    private List<Item> products;
    private Payment paymentMethod;
    private Sale saleMethod;

    public Cart() {
        products = new LinkedList<>();
    }
    
    public void addItem(Item p){
        products.add(p);
    }
    
    public void removeItem(Item p){
        products.remove(p);
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setSaleMethod(Sale saleMethod) {
        this.saleMethod = saleMethod;
    }

    public Stream<Item> getItems() {
        return products.stream();
    }
    
    
    
   // public boolean pay(){
       // double finalPrice = saleMethod.getDiscountedPrice(getPrice());
       // return paymentMethod.pay(finalPrice);
  //  }
    
    public void accept(MyVisitor v){
        v.visit(this);
    }
    
    @Override
    public String toString(){
        return "zizzopanizzo";//todo
    }
    
}
