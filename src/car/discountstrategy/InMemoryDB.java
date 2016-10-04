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
public class InMemoryDB implements DataStore {

    private Customer[] customers = { 
        new Customer("Jones" , "Sally" , "C100"),
        new Customer("Smith" , "Bob", "C101"),
        new Customer("Schmidt" , "Jack" , "C102")
    };

    @Override
    public Customer findCustByID(String custID) {
       return null;
    }
    
    
}
