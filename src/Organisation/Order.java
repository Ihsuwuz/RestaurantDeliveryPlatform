/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;

import Payment.Observer;
import Payment.Bill;
import Restaurant.Dish;
import Restaurant.Restaurant;
import Customer.Customer;
import java.util.List;

/**
 *
 * @author Ih
 */
public class Order implements Subject{
    private List<Dish> dishList;
    private Restaurant restaurant;
    private Customer customer;
    private Bill bill;
    
    public String printBill(){
        return bill.getBill();
    }
    
    public void execute(){
        //TODO: execute the Order
    }
    
    public void addDish(Dish d){
        dishList.add(d);
    }

    @Override
    public void register(Observer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unregister(Observer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
