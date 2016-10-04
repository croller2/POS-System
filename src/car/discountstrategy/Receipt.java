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
public class Receipt {
    private Customer customer;
    private LineItem item;
    private DataStore dataStore;
    
    public Receipt(String custID, DataStore dataStore) {
        
        this.dataStore = dataStore;
        customer = dataStore.findCustByID(custID);
    }
    
}
