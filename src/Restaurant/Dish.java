/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

/**
 *
 * @author Ih
 */
public abstract class Dish {
    protected String dishName;
    protected double dishPrice;
    
    public Dish(String n, double p){
      dishName = n;
      dishPrice = p;
    }
    
    public String getDishName() {
        return dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }
    
}
