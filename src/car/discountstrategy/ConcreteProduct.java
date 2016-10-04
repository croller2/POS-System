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
//Rename to something more apt once I figure out product structure
public class ConcreteProduct implements Product {
    
    private double price;
    private String productID;
    private Discount discount;
    
    public ConcreteProduct(double price, String productID) {
        this.price = price;
        this.productID = productID;
    }

    @Override
    public final Discount getDiscountType() {
        return discount;
    }

    @Override
    public final void setDiscountType(Discount discount) {
        this.discount = discount;
    }

    
    
    @Override
    public final double getPrice() {
        return price;
    }

    @Override
    public final void setPrice(double price) {
        this.price = price;
    }

    @Override
    public final String getProductID() {
        return productID;
    }

    @Override
    public final void setProductID(String productID) {
        this.productID = productID;
    }
    

}
