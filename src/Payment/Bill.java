/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

import Organisation.Subject;
import Organisation.Order;
import Restaurant.Dish;
import java.util.*;


/**
 *
 * @author Ih
 */
public class Bill implements BillInterface, Observer {
 private  double orderBill;
 private Dish theDish ;
 private TotalPrice allPrice;
 private double currentPrice;
 private final ArrayList<Double> priceToPay;
 private String myOrder;
 private Order checkOrder;
 
  public Bill (String theOrder, double _orderBill ){
        this.priceToPay = new ArrayList<>();
      this.myOrder = theOrder;
      this.orderBill = _orderBill; 
  }
  
  public Bill (){this.priceToPay = new ArrayList<>();
}
  
    public String getOrder(){
        return myOrder;
    }
     
    public double getOrderBill(){
        return orderBill;
    }
   
    @Override
    public String getBill() {
     // currentPrice = theDish.getDishPrice();
      priceToPay.add(orderBill);
      for(int i = 0; i < priceToPay.size(); i++){
         currentPrice = priceToPay.get(i);
           update(this.orderBill);
          // myOrder.register(this);
      }
       System.out.print("Inside Update method ");
      /*priceToPay.stream().forEach((String p) -> {
          myOrder.register(this);
          this.update(Double.parseDouble(p)); 
      });*/
        
       return "\n Your current Bill: " + currentPrice; //+ "\t Total price bill \n" + 
             // "\n"+ allPrice.getTotalPrice(priceToPay); 
       //return currentPrice;      
    }
    public void cancelBill(){
        checkOrder.unregister(this);
    }
    
    @Override
    public void update(double bill) {
        this.orderBill = bill;
        boolean check = true;
        ArrayList<Double> billList = new ArrayList<>();
        billList.add(orderBill);
        if(proceedPayment(check) == false){
            cancelBill(); 
        }
        else{
            this.printUpdatedBill(billList);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void printUpdatedBill(ArrayList<Double> _billList){
         _billList.stream().forEach((p)->{
             System.out.println(p);
         });
    }
    
    public boolean proceedPayment(boolean n){
        return true;
    }
    
    @Override
    public void setSubject(Subject sub) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
