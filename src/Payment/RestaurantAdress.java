/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;
import Restaurant.Restaurant;
/**
 *
 * @author Ih
 */
public class RestaurantAdress extends BillDecorator {
   private Restaurant theAddress;
    
    public RestaurantAdress(BillInterface newBill) {
        super(newBill);
        
    }
    
    @Override
    public String getBill(){
        return tempBill.getBill() + " " + getAddress();
    }   
 
   
    public String getAddress(){
        return theAddress.getRestaurantName() + " " + theAddress.getLocation();
    }

    @Override
    public String addFood() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String addDrink() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String addDessert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
