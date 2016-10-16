/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Ih
 */
public class Customer {
    //perhaps consecutiveNumber should not be private ...
    private static int consecutiveNumber = 0;
    private int customerID;
    private String name;
    private String password;
    private boolean logInStatus;


    
    public Customer(String pw, String n){
        customerID = consecutiveNumber++;
        name = n;
        password = pw;
        logInStatus = false;
    }
    
    public boolean logIn(String pw, String n){
        if (pw == password && n == name)
            logInStatus = true;
        return logInStatus;
    }
    
        public boolean isLogInStatus() {
        return logInStatus;
    }
}
