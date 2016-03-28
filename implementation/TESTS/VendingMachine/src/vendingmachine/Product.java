/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author Anon
 */
public class Product {
   private String name;
   private double price;
   private int quantity;
   private int currencyType;
   

   
   /**
    *
    * @param name
    * @param price
    * @param quantity
    * @param currType
    * @param weight
    */
   public Product(String name,double price,int quantity,int currType){
       this.name =name;
       this.price = price;
       this.quantity = quantity;
       this.currencyType = currType;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(int currencyType) {
        this.currencyType = currencyType;
    }
   
}
