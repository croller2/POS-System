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
public class Product {
    
    private double price;
    private String productID;
    private DiscountStrategy discount;
    private String prodName;
    
    public Product(String productID, String prodName, double price, DiscountStrategy discount) {
        this.price = price;
        this.productID = productID;
        this.prodName = prodName;
        this.discount = discount;
    }


    public final DiscountStrategy getDiscountType() {
        return discount;
    }


    public final void setDiscountType(DiscountStrategy discount) {
        this.discount = discount;
    }

    
 
    public final double getPrice() {
        return price;
    }

   
    public final void setPrice(double price) {
        this.price = price;
    }

    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        this.productID = productID;
    }
    

}
