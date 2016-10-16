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
public class OrderList extends BillDecorator {
    
    public OrderList(BillInterface newBill) {
        super(newBill);
    }
    
    @Override
    public String getBill(){
        return tempBill.getBill() + "Dish 1" + "Price of Dish 1";
    }   
}
