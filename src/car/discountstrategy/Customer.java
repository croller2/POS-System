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
class Customer {
    private String firstName;
    private String lastName;
    private String custID;

    public Customer(String firstName, String lastName, String custID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.custID = custID;
    }
    
    

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final String getCustID() {
        return custID;
    }

    public final void setCustID(String custID) {
        this.custID = custID;
    }

    @Override
    public String toString() {
        return "Customer{" + "firstName=" + firstName + ", lastName=" + lastName + ", custID=" + custID + '}';
    }
    
    
}
