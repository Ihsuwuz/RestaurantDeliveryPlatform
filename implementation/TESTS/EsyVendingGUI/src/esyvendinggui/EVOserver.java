/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esyvendinggui;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Anon
 */
public class EVOserver implements Observer{
   private ObservableVals ov = null;
   private EsyVendingGUI gui = null;
   public EVOserver(ObservableVals ov, EsyVendingGUI gui)
   {
      this.ov = ov;
      this.gui = gui;
   }
    @Override
    public void update(Observable o, Object arg) {
        if (o == ov)
      { /*
           Need to implement the update method here 
           we have multiple values in the observableVals object
            + so we need to listen for a change in these values
            + find out which variable has changed
            + Act accordingly
          
          */
         // that the loginListener observer when user enters save we can access
          // the new data fields
          if(ov.isLoginListeneer()==true){
         System.out.println("Test this MotherFucker "+ov.isLoginListeneer());
         String test =gui.login.getName().toString();
         System.out.println(test);
         ov.reset();
         }
          if(ov.isChangeLoginListener()==true){
         System.out.println("Test this MotherFucker "+ov.isChangeLoginListener());
         //String test = gui.;
         //System.out.println(test);
         ov.reset();
         }
           if(ov.isFirstSetUpListener()==true){
         System.out.println("Test this MotherFucker "+ov.isFirstSetUpListener());
         String test = gui.machineSetup.getName().toString();
         System.out.println(test);
         ov.reset();
         }
         if(ov.isSlotConfigListener()==true){
           System.out.println("Test this MotherFucker "+ov.isSlotConfigListener());
           String test = gui.businessSetUp.getALL();
           System.out.println(test);
           ov.reset();
         }
         if(ov.isStartBusinessSetupListener()==true){
              gui.businessSetup();
              ov.reset();
         }
         if(ov.isStartChangeLoginListener()==true){
             gui.loginSetup();
             ov.reset();
         }
            if(ov.isStartFirstSetupListener()==true){
             gui.setUp();
             ov.reset();
         }
         if(ov.isStartLoginListener()==true){
             gui.login();
             ov.reset();
         }
         if(ov.isStartMainMenuListener()==true){
             gui.MainMenu();
             ov.reset();
         }
         if(ov.isStartReportListener()==true){
             //gui.incidents();
         }
        
      }
    
    }
}
