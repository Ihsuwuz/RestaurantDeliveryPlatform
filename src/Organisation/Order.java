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
import java.util.*;

/**
 *
 * @author Ih
 */
public class Order implements Subject{
    private ArrayList<Dish> dishList = new ArrayList<>();
    private ArrayList<Bill> bm = new ArrayList<>();
    private ArrayList<String> productOrdered = new ArrayList<>();
    private Restaurant restaurant;
    private Customer customer;
    private Bill bill;
    private double p;
    private Dish pickDish;
    
    public Order(){}
    
    public String printBill(){
        return bill.getBill();
    }
    
    public void execute(){
        //TODO: execute the Order
    }
    
    public String addDish(Dish d){
       String aD = d.getDishName();
       dishList.add(d);
       return aD;       
    }

    @Override
    public void register(Observer obj) {
        pickDish.getDishName();
        bill.getOrderBill();
       
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unregister(Observer obj) {
        bill.cancelBill();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() {
        for(Bill m : bm){
          // this.register(m);
           m.update(p);
           bill.update(this.p);
           
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
