/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package esyvendinggui;

/**
 *
 * @author Anon
 */
import java.sql.*;
import java.util.*;
public class NewClass {
	public static final DatabaseHelper helper =  new DatabaseHelper();
    public static void main(String args[]){
       
        EsyVendingGUI gui = new EsyVendingGUI();
        ArrayList<String> n = new ArrayList<String>();
        helper.dBopen();
        n = helper.getIncidents();
        helper.dBclose();
        gui.MainMenu();
        gui.setUp();
        gui.login();
        gui.businessSetup();
        gui.errorMessage("FUCK THIS IS GOOD");
        gui.Incidents(n);
    
    }
}
