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
    private LineItem[] lineItems;
    private DataStore dataStore;
    
    
    public Receipt(String custID, DataStore dataStore) {
        lineItems = new LineItem[0];
        this.dataStore = dataStore;
        customer = dataStore.findCustByID(custID);
        System.out.println(customer);
    }
    
    public final void addProduct(String prodId, int qty, DataStore dataStore){
        LineItem item = new LineItem(prodId, qty, dataStore);
        addItemToLineItems(item);
    }
    
    
    private void addItemToLineItems(LineItem item){
        LineItem[] temp = new LineItem[lineItems.length + 1];
        for(int i = 0 ; i < lineItems.length ; i++){
            temp[i] = lineItems[i];
           
        }
        temp[temp.length - 1] = item;
        lineItems = temp;
        temp = null;
    }
    
}
