
import java.util.*;

/**
 * 
 */
public abstract class System {
    /**
     * Default constructor
     */
    public System() {
    	
    }

    /**
     * 
     */
    public DatabaseHelper database;

    /**
     * 
     */
    public Server server;



    /**
     * @return
     */
    public void setUpDatabase() 
    {
        // TODO implement here
    	database.createDataBase();
    //	database.getMachineConfig();
    	
    }

    /**
     * @return
     */
    public void runServer() {
        // TODO implement here
       server.sendData();
    }

    /**
     * @return
     */
    public void reset() {
         int n;
		// TODO implement here
    	//DatabaseHelper database = new DatabaseHelper();
    	  database.deleteTable(n);
    	  database.dBclose();
    	  DatabaseHelper database;
    	  database.dBopen();
    }

    /**
     * @return
     */
    public abstract void reorder();
    	
    /**
     * @return
     */
    public abstract void errorMessage();

    /**
     * @param String String 
     * @return
     */
    public abstract boolean validateLogin(void String String);

    /**
     * @param String String 
     * @return
     */
    public abstract void setLoginDetails(void String String);

    /**
     * @return
     */
    public abstract void listenConnect();

    /**
     * @return
     */
    public abstract double getConfig();

    /**
     * @param String 
     * @return
     */
    public abstract void setConfig(void String);

}
