/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.discountstrategy;

/**
 *
 * @author chris
 */
public class DiscountQuantityAmount implements Discount {
    
    private double discountPercent;
    private double minQty;

    public DiscountQuantityAmount(double discountPercent, double minQty) {
        this.discountPercent = discountPercent;
        this.minQty = minQty;
    }
    
    
    @Override
    public final double calculateDiscount(ConcreteProduct product) {
        double finalPrice = product.getPrice()*discountPercent;
        return finalPrice; 
    }

    @Override
    public final double getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public final void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
    
}
