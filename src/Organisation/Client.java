/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organisation;

import Restaurant.Restaurant;
import java.util.List;

/**
 *
 * @author Ih
 */
public class Client {
    private List<Restaurant> restaurants;
    private List<Order> orders;
    
    
    public List<Restaurant> showRestaurants() {
        return restaurants;
    }
}

