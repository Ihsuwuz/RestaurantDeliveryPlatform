/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esyvendinggui;

import java.util.ArrayList;

/**
 *
 * @author Anon
 */
public class NewClass {
    public static void main(String args[]){
     
        EsyVendingGUI gui = new EsyVendingGUI();
        
        ArrayList<String> Dummy = new ArrayList<String>();
        String a = "test,this,shit,until,head explodes";
        String b = "test,this,shit,until,head explodes";
        String c = "test,this,shit,until,head explodes";
        String d = "test,this,shit,until,head explodes";
        String e = "test,this,shit,until,head explodes";
        Dummy.add(0,a);
        Dummy.add(1,b);
        Dummy.add(2,c);
        Dummy.add(3,d);
        Dummy.add(4,e);
        
        gui.MainMenu();
        
    
    }
}
