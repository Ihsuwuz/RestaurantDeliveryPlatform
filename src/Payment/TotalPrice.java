/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

//import Restaurant.Dish;
import java.util.*;

/**
 *
 * @author Ih
 */
public class TotalPrice extends BillDecorator{
    
    private Bill aBill;
    private double dishPrice;
    public TotalPrice(BillInterface newBill) {
        super(newBill);
    }
   
    @Override
    public String getBill(){
        return tempBill.getBill() + "\n Total Price";
      
    }   
    
    public String getTotalPrice(ArrayList<Double> dBill){
        double sumTotal = 0.0;
        for(int x =0; x< dBill.size(); x++){
          sumTotal += dBill.get(x);
        }
        return String.valueOf(sumTotal);
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
