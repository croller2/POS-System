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
public class LineItem {
    private Product product;
    private int qty;

    public LineItem(String prodID, int qty, DataStore dataStore) {
        this.product = dataStore.findProdByID(prodID);
        this.qty = qty;
    }



    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
            
}
