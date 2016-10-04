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
public class Register {

    private Receipt receipt;
    public final void startNewSale(String custID, DataStore dataStore) {
        receipt = new Receipt(custID, dataStore);
    }

    public final void addProductToSale(String productID, int qty) {
        
    }

    public final void endSale() {
        
    }
    
}
