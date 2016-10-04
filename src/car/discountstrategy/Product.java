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
public interface Product {

    Discount getDiscountType();

    double getPrice();

    String getProductID();

    void setDiscountType(Discount discount);

    void setPrice(double price);

    void setProductID(String productID);
    
}
