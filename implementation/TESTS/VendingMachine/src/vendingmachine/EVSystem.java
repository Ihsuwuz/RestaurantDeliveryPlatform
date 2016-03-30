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
public abstract class EVSystem {
    
    
     /**
     * 
     */
    protected final DatabaseHelper database;
    protected double overAllProductValue;

    
    /**
     * 
     */
    protected final Server server;
    
    protected Slot[] slots;

    public abstract Slot[] getSlots();
   
    public abstract void setSlots(Slot[] slots);
    
    public EVSystem(){
       this.database = new DatabaseHelper();
       this.server = new Server();
    }

     /**
     * @return
     */
    public double getOverAllProductValue() {
        return overAllProductValue;
    }

    public void setOverAllProductValue(double overAllProductValue) {
        this.overAllProductValue = overAllProductValue;
    }
    public void setUpDatabase() 
    {
        // TODO implement here
        database.dBopen();
    	database.createDataBase();
        database.dBclose();   	
    }

    /**
     */
    public void runServer() {
        /**
         *  We will have another observer here
         *  listening   for connections
         */
       
    }
    

    /**
     */
    public void reset() {
         int n;
         // TODO implement here
    	//DatabaseHelper database = new DatabaseHelper();
    	  database.dBopen();
          database.deleteAll();
    	  database.dBclose();
    	
    }
    public abstract void sendData(String [] data);
    
    public abstract void reorder();
 
    public abstract void errorMessage();

    
    public abstract boolean validateLogin(String username, String password);
       

   
    public abstract void setLoginDetails(int tableID,String[]n);

    
    public abstract void listenConnect();

   
    public abstract double getConfig();

    
    public abstract void setConfig(int tableID,String[] dbUpdate);
    
}
 



   
