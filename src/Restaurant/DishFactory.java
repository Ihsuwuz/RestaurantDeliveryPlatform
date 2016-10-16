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
                return new Food();
                    
            case DESSERT:
                return new Dessert();
                         
            case ALCDRINK:
                return new Drink();
                
            case SOFTDRINK:
                return new Drink();
                
            default:
                return null;
        }
    }
}
