/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JeSe
 */
import Customer.Customer;
import Payment.BillInterface;
import Payment.OrderList;
import Restaurant.Dish;
import Organisation.Order;
import Payment.Bill;
import Payment.TotalPrice;
import static Restaurant.DishType.FOOD;
import Restaurant.Food;
import java.util.*;


public class testRestaurant {
    
    public static void main (String []args){
 BillInterface bill ;
      Bill b = new Bill();
      TotalPrice tp ;
        tp = new TotalPrice(bill = b);
      double cost;
      String ord;
      ArrayList<Double> a = new ArrayList<>();
      
       Dish aDish = new Food("Pasta", 5.45);   
       Customer cus = new Customer("1234", "Jocy");
       Order one = new Order();
       //OrderList hey = new OrderList(bill= b);
       a.add(aDish.getDishPrice());
       
      System.out.print("Dish name is " + aDish.getDishName()+ "\t ");
      System.out.print(" Price is " + aDish.getDishPrice()+ "\n");
      
        aDish.setDishName("Rice");
        aDish.setDishPrice(8.99);
        one.addDish(aDish); 
        ord = aDish.getDishName();
        cost = aDish.getDishPrice();
        
        a.add(cost);
        a.add(cost);
        
        Bill myBill = new Bill( ord, cost); 
      // System.out.println();
       //System.out.print(hey.getBill());
       System.out.println(myBill.getOrder());
       System.out.println(myBill.getOrderBill());
       System.out.println("\n Round 1" + myBill.getBill());
       System.out.println("Updated to ..");
       myBill.update(3.30);
       System.out.println("check");
       cost = aDish.getDishPrice();
       a.add(cost);
       System.out.println("\n Round2 "+ myBill.getBill());
       System.out.print("All bills value outline.. \n");
       myBill.printUpdatedBill(a);
       System.out.println("Total Bill is " + tp.getTotalPrice(a));
       //System.out.print(b.printUpdatedBill(a));
    }
    
    
}
