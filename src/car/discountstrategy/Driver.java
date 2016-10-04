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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Register register = new Register();
        DataStore dataStore = new InMemoryDB();
        //Customer Number 1
        register.startNewSale("C100" , dataStore);
        register.addProductToSale("A101" , 2);
        register.addProductToSale("B200" , 3);
        register.addProductToSale("P400" , 1);
        register.endSale();
    }
    
}
