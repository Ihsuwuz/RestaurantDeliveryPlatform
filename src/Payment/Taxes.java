/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

import Restaurant.Dish;
import java.util.*;
/**
 *
 * @author Ih
 */
public class Taxes extends BillDecorator{
    private TotalPrice getTaxPrice;
    private Dish someDish;
    private double dishPrice;
    ArrayList<Double> tot = new ArrayList<>();
    
    public Taxes(BillInterface newBill) {
        super(newBill);
    }
    
    @Override
    public String getBill(){
        return tempBill.getBill() + " \n Taxes are: " + getTaxedBill();
                
    }   
    public String getTaxedBill(){
         dishPrice = someDish.getDishPrice();
         tot.add(dishPrice);
         String tx = getTaxPrice.getTotalPrice(tot);
         /*double tax =0.0;
         for(int j= 0; j< tot.size(); j++){
             tax = (tax + tot.get(j))/5;
         }*/
         return " \n Taxes are: TotalPrice/5 "
                 + String.valueOf(Double.parseDouble(tx)/(5)) ;
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
