/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import java.sql.Time;
import java.util.List;

/**
 *
 * @author Ih
 */
public class Restaurant {
    String restaurantName;
    String location;
    Time open;
    Time close;
    List<Dish> menu;

    
    public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public List<Dish> getMenu() {
        return menu;
    }
    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }
    public void setOpen(Time open) {
        this.open = open;
    }
    public void setClose(Time close) {
        this.close = close;
    }
    public String getOpeningHours() {
        return open + " - " + close;
    }
    
    public void addDish(Dish d){
        menu.add(d);
    }
    public void removeDish(int i){
        menu.remove(i);
    }
    public Dish getDish(int i){
        return menu.get(i);
    }
}
