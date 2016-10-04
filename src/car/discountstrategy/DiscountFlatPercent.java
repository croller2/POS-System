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
public class DiscountFlatPercent implements DiscountStrategy{
    
    private double discountPercent = .10;

    public DiscountFlatPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public final double getDiscountPercent() {
        return discountPercent;
    }

    public final void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    //Should this be calculated and returned as an amount off or a final price?
    public final double getDiscountAmt(double unitCost , int qty){
        
        return unitCost * qty * discountPercent;
    }
}
