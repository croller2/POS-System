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
public class DiscountQuantityAmount implements DiscountStrategy {
    
    private double discountPercent = .10;
    private double minQty = 5;

    
  public final double getDiscountAmt(double unitCost , int qty){
        
       double discount = 0;
       if(qty>= minQty){
           discount = unitCost * qty * discountPercent;
       }
       return discount;
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
