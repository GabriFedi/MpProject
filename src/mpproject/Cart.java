/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.util.LinkedList;
import java.util.List;

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

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setSaleMethod(Sale saleMethod) {
        this.saleMethod = saleMethod;
    }
    
    public double getPrice(){
        return products.stream().mapToDouble(Item::getPrice).sum();
    }
    
    public boolean pay(){
        double finalPrice = saleMethod.getDiscountedPrice(getPrice());
        return paymentMethod.pay(finalPrice);
    }
    
    @Override
    public String toString(){
        return "zizzopanizzo";//todo
    }
    
}
