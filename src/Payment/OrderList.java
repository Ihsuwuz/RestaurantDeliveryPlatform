/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

import java.util.ArrayList;
import Restaurant.Dish;
/**
 *
 * @author Ih
 */
public class OrderList extends BillDecorator {
    private final ArrayList<String> allOrder;
    private Dish myChoice;
    private String myFood, myDrink, myDessert, display;
    
    public OrderList(BillInterface newBill) {
        super(newBill);
        allOrder = new ArrayList<>();
    }
    
      
    @Override
    public String getBill(){
        return " Dish 1" + "\t Price of Dish 1 "
                 + "\n "+ displayOrderList();
    }   
     
    @Override
    public String addFood(){
        myFood = myChoice.getDishName() + " " + String.valueOf(myChoice.getDishPrice());
       allOrder.add(myChoice.getDishName());
       allOrder.add(String.valueOf(myChoice.getDishPrice()));
        allOrder.add(myFood);
       return myFood;
    }
    
    @Override
    public String addDrink(){
        myDrink = myChoice.getDishName() + " " + String.valueOf(myChoice.getDishPrice());
       allOrder.add(myDrink);
       return myDrink;
    }
    
    @Override
    public String addDessert(){
        myDessert = myChoice.getDishName() + " " + String.valueOf(myChoice.getDishPrice());
        allOrder.add(myDessert);
       return myDessert;
    }
    
    //to printout the overall orderList
    public String displayOrderList(){
       // display = addFood() + "\n" + addDrink() + "\n" + addDessert();
        ArrayList<String> output = new ArrayList<>();    
        for(int i =0; i < allOrder.size(); i++){
            output.add(allOrder.get(i));
        }
        return String.valueOf(output);
    }
}
