/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

/**
 *
 * @author Ih
 */
//import java.util.ArrayList;

abstract public class BillDecorator implements BillInterface {
    protected BillInterface tempBill;
    //private ArrayList<OrderList> payType;

    public BillDecorator(BillInterface newBill){
        tempBill = newBill;
        
    }
  
    @Override
    public String getBill(){
        return tempBill.getBill();
    }
    
    public abstract String addFood();
    public abstract String addDrink();
    public abstract String addDessert();
   
}