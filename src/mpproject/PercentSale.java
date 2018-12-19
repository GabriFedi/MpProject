/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

/**
 *
 * @author alessandro
 */
public class PercentSale extends AbstractDecSale{
    double percentSale;
    
    public PercentSale(Sale s, double percentSale){
        super(s);
        this.percentSale = percentSale;
    }
    
    @Override
    public double getDiscountedPrice(double price) {
        double pr = super.getDiscountedPrice(price);
        double saleAmount = pr/100.*percentSale;
        return pr-percentSale;
    }
    
}
