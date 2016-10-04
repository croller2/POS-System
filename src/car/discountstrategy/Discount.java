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
public interface Discount {

    //Should this be calculated and returned as an amount off or a final price?
    double calculateDiscount(ConcreteProduct product);

    double getDiscountPercent();

    void setDiscountPercent(double discountPercent);
    
}
