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
public class DishFactory {
    
    //Singleton Pattern
    private static DishFactory INSTANCE = null;
    private DishFactory(){}
    
    public DishFactory getInstance() {
	if (INSTANCE == null)
            INSTANCE = new DishFactory();
	return INSTANCE;
    }
        
    public Dish makeDish(DishType dishType, String name, double price){
        //TODO: constructors which make sense
        switch (dishType) {
            case FOOD:
                return new Food(name, price);
                     
            case DESSERT:
                return new Dessert(name, price);
                         
            case ALCDRINK:
                return new Drink(name, price);
                
            case SOFTDRINK:
                return new Drink(name, price);
                
            default:
               throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
