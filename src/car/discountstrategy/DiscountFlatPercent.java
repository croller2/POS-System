package car.discountstrategy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class DiscountFlatPercent implements Discount{
    
    private double discountPercent;

    public DiscountFlatPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public final double getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public final void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    //Should this be calculated and returned as an amount off or a final price?
    @Override
    public final double calculateDiscount(ConcreteProduct product){
        double price = product.getPrice()*(1- discountPercent);
        
        return price;
    }
}
