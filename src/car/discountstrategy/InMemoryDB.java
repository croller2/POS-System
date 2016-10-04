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
    
    private Product[] products = {
        new Product("P100" , "BaseBall Hat" , 10.99 , new DiscountFlatPercent(.10) ),
        new Product("P101" , "Men's Belt" , 29.98 , new DiscountFlatPercent(.15)),
        new Product("P102" , "Ladies Blouse" , 49.99, new DiscountFlatPercent(.20))
    };

    @Override
    public final Customer findCustByID(String custID) {
        Customer foundCust = null;
        
        for (Customer c : customers){
            if( custID.equals( c.getCustID() ) ){
                foundCust = c;
                break;
            }
        }
       return foundCust;
    }
    

    @Override
    public final Product findProdByID(String prodID) {
                Product foundProd = null;
        
        for (Product p : products){
            if (prodID.equals(p.getProductID())){
                foundProd = p;
                break;
            }
        }
        return foundProd;
    }

 
    
    
}
