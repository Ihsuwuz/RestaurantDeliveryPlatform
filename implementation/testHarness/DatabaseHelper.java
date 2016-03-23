
import java.util.*;
import java.sql.*;

/**
 * 
 */
public class DatabaseHelper {

    /*

    SIDE NOTE WE WILL NEED TO ADD CLASS PATH TO JAR THAT ACTS AS MEDIATOR TO SQLITE ENGINE

    $javac OurApp.java
    $java -classpath ".:sqlite-jdbc-3.8.11.2.jar" OurApp


     * Default constructor
       Creates a connection to dataBase for life time of
       application
     */
    private Connection c;
    private Statement stmt = null;

    public DatabaseHelper() {
        c = null;
        try {
          Class.forName("org.sqlite.JDBC");
          c = DriverManager.getConnection("jdbc:sqlite:easyVending.db");
        } 
        catch ( Exception e ) {
          System.out.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
        System.out.println("Opened database successfully");
        // TODO implement here
    }
    /*
         Method to create DataBase Tables
         only called during first Setup
     */
    public void dBclose(){
      try{
        c.close();
      }
       catch ( Exception e ) {
          System.out.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
        System.out.println(" database closed successfully");
    }
    public void createDataBase() {

      String sql;
      try{
        stmt = c.createStatement();

        sql = "CREATE TABLE IF NOT EXISTS TECHNICIAN  " +
                     "(ID INT PRIMARY KEY     NOT NULL," +
                     " USERNAME             CHAR(25) NOT NULL ,    " + 
                     " PASSWORD             CHAR(25) NOT NULL ,    " + 
                     " EMAIL             CHAR(25) NOT NULL, " + 
                     " PHONE             CHAR(25) NOT NULL) ";
        stmt.executeUpdate(sql);
        
        sql = "CREATE TABLE IF NOT EXISTS SLOT_CONFIG  " +
                     "(ID INT PRIMARY KEY     NOT NULL," +
                     " PRODUCT_NAME           TEXT    NOT NULL, " + 
                     " QUANTITY               INT     NOT NULL, " + 
                     " PRICE         REAL,"+ 
                     " TEMP_RANGE             REAL,    " + 
                     " TEMP               INT NOT NULL, " + 
                     " CURRENCY_ID        REAL)"; 
        stmt.executeUpdate(sql);
       
        sql = "CREATE TABLE  IF NOT EXISTS INCIDENT " +
                     "(ID INT PRIMARY KEY     NOT NULL," +
                     " INCIDENT_DATE    REAL DEFAULT (datetime('now', 'localtime')),    " + 
                     " TYPE             CHAR(25) NOT NULL, " + 
                     " RESPONSE         CHAR(50) NOT NULL,    " + 
                     " FINANCIAL_STATE_PRE  REAL NOT NULL, " + 
                     " FINANCIAL_STATE_POST REAL NOT NULL)";  
        stmt.executeUpdate(sql);
       
        sql = "CREATE TABLE IF NOT EXISTS ACCOUNT " +
                     "(CURR_DATE    REAL DEFAULT (datetime('now', 'localtime'))," + 
                     " MONEY        REAL NOT NULL)"; 
        stmt.executeUpdate(sql);
        stmt.close();
      }
      catch ( Exception e ) {
          System.out.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
        System.out.println("database successfully created");
    }
    /*
     * @param String[] 
     * @return
     */
    public void insertTable( String[] n ,int i){
        // TODO implement here
        /*We want to identify which tables are to be updated so 
          I suggest here a switch statement we have 5 table so 1 -5 */
          String sql="";

           
        switch(i){

           case 1: sql = "INSERT INTO SLOT_CONFIG (ID,PRODUCT_NAME,QUANTITY,PRICE,TEMP_RANGE,TEMP,CURRENCY_ID) " +
                   "VALUES ("+n[0]+","+"'"+n[1]+"',"+n[2]+","+n[3]+","+n[4]+","+n[5]+","+n[6]+");";
                   System.out.println(sql);
                   break;
           case 2:  sql = "INSERT INTO TECHNICIAN (ID,USERNAME,PASSWORD,EMAIL,PHONE) " +
                   "VALUES ("+n[0]+","+"'"+n[1]+"',"+"'"+n[2]+"'"+","+"'"+n[3]+"'"+","+"'"+n[4]+"'"+");";
                    System.out.println(sql); break;
           case 3:  sql = "INSERT INTO INCIDENT (ID,INCIDENT_DATE,TYPE,RESPONSE,FINANCIAL_STATE_PRE,FINANCIAL_STATE_POST) " +
                   "VALUES ("+n[0]+","+n[1]+","+"'"+n[2]+"'"+","+"'"+n[3]+"'"+","+n[4]+","+n[5]+");";
                    System.out.println(sql);
                    break;
           case 4:  sql = "INSERT INTO ACCOUNT (CURR_DATE,MONEY) " +
                   "VALUES ("+n[0]+","+n[1]+");";
                    System.out.println(sql);
                   break;
        }
      try{
      stmt = c.createStatement(); 
      stmt.executeUpdate(sql);
      stmt.close();
      c.commit();
      }
      catch ( SQLException e ) {
          System.out.println( e.getClass().getName() + ": " + e.getMessage() );
           System.out.println("Error in InsertTable");
          System.exit(0);

        }
        System.out.println("Insert) database successfully");
    }
    public void updateTable(String[] n) {
         String sql="";
        try{
          stmt = c.createStatement();

          /*
              We make a little easier on us and use Arrays to id what we want
              index 0 holds table name 1 collumn name 2 actual value 3 the id 
          */
         if(n[0].equals("SLOT_CONFIG")){
             if(n[1]=="PRODUCT_NAME")
                     sql = "UPDATE "+n[0]+" set "+n[1]+" = '"+n[2]+"' where ID="+n[3]+";";
             else
               sql = "UPDATE "+n[0]+" set "+n[1]+" = "+n[2]+" where ID="+n[3]+";";
         }
         else if(n[0].equals("TECHNICIAN")){
             sql = "UPDATE "+n[0]+" set "+n[1]+" = '"+n[2]+"' where ID="+n[3]+";";
         }
        
         else if(n[0].equals("ACCOUNT")){
               sql = "UPDATE "+n[0]+" set "+n[1]+" = "+n[2]+" where ID="+n[3]+";";
         }
         stmt.executeUpdate(sql);
         c.commit();
       }
       catch ( Exception e ) {
          System.out.println( e.getClass().getName() + ": " + e.getMessage() );
           System.out.println("Error in InsetTable");
          System.exit(0);
        }
        System.out.println("update database successfully");
    }

    public void deleteTable(int n){
       String sql = "";
       switch(n){
           case 1: sql =  "DELETE from SLOT_CONFIG;";
            break;
           case 2:  sql=  "DELETE from TECHNICIAN;";
            break;
           case 3:  sql = "DELETE from INCIDENT;";
            break;
           case 4:  sql = "DELETE from ACCOUNT;";
            break;
       }
       try{
       
       stmt = c.createStatement();
       stmt.executeUpdate(sql);
       c.commit();
       stmt.close();
      }

      catch ( Exception e ) {
          System.out.println( e.getClass().getName() + ": " + e.getMessage() );
           System.out.println("Error in InsetTable");
          System.exit(0);
        }
        System.out.println(" delete successfully");
    }
    public void deleteFromTable(String[] n){
       try{

       stmt = c.createStatement();
       String sql = "DELETE from "+n[0]+" where ID="+n[1]+";";
       stmt.executeUpdate(sql);
       c.commit();
       stmt.close();
      }
      catch ( Exception e ) {
          System.out.println( e.getClass().getName() + ": " + e.getMessage() );
           System.out.println("Error in InsetTable");
          System.exit(0);
        }
        System.out.println(" delete successfully");
    }
    public ArrayList<String> getMachineConfig() {
        // TODO implement here
        ArrayList<String> config = new ArrayList<String>();
         try{
             
             ResultSet rs = stmt.executeQuery( "SELECT * FROM SLOT_CONFIG;" );
             String firstSearch="";
             String secondSearch="";
             int ctr=0;
           while ( rs.next() ) {
             int id = rs.getInt("id");
             String  product_name = rs.getString("product_name");
             int quantity  = rs.getInt("quantity");
             float price = rs.getFloat("price");
             float temperature = rs.getFloat("temperature");
             int temp = rs.getInt("temp");
             int currencyID = rs.getInt("currencyID");
             firstSearch = ""+id+","+product_name+","+quantity+","+price+","+temperature+","+temp+","+currencyID;
             config.add(ctr,firstSearch);
             ctr=ctr+1;
          }
          rs.close();
          stmt.close();
       }
       catch ( Exception e ) {
          System.out.println( e.getClass().getName() + ": " + e.getMessage() );
           System.out.println("Error in InsetTable");
          System.exit(0);
        }
        System.out.println("Returned config successfully");
      return config;
    }
    public String getPassword(String userName,String email){
      String password="";
      try{
        ResultSet rs = stmt.executeQuery( "SELECT PASSWORD FROM TECHNICIAN WHERE USERNAME="+"'"+userName+"' AND EMAIL="+"'"+email+"';");
       
         while ( rs.next() ) {
         password = rs.getString("password");
        }
        rs.close();
        stmt.close();
      } 
      catch ( Exception e ) {
          System.out.println( e.getClass().getName() + ": " + e.getMessage() );
           System.out.println("Error in InsetTable");
          System.exit(0);
        }
        System.out.println("returned password successfully"); 
        // TODO implement here
      return password;
    }
    public ArrayList<String> getIncidents(){
    ArrayList<String> incidents = new ArrayList<String>();
     try{
           String returnVal="";
           
           ResultSet rs = stmt.executeQuery( "SELECT * FROM INCIDENT;" );
           int ctr=0;
         while ( rs.next() ) {
           int id = rs.getInt("id");
           float  date = rs.getFloat("date");
           int type  = rs.getInt("type");
           String  response = rs.getString("response");
           float financial_state_pre = rs.getFloat("financial_state_pre");
           float financial_state_post = rs.getFloat("financial_state_post");
           returnVal = id+","+date+","+response+","+financial_state_pre+","+financial_state_post;
           incidents.add(ctr,returnVal);
           ctr =ctr+1;
        }
        rs.close();
        stmt.close();
      }
      catch ( Exception e ) {
          System.out.println( e.getClass().getName() + ": " + e.getMessage() );
           System.out.println("Error in InsetTable");
          System.exit(0);
        }
        System.out.println("returned incidents successfully");
      return incidents;
    }

}