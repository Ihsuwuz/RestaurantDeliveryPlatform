/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Anon
 */
public class EVOserver implements Observer{
   private ObservableVals ov = null;
   private EsyVendingGUI gui = null;
   private VendingMachine vm = null;
   public EVOserver(ObservableVals ov, EsyVendingGUI gui,VendingMachine vm )
   {
      this.ov = ov;
      this.gui = gui;
      this.vm = vm;
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
            if(vm.validateLogin(gui.login.getUsername(),gui.login.getPassword()) == true){
               gui.MainMenu();
            }
            else{
               gui.errorMessage("Invalid user or password");
            }
            ov.reset();
         }
         if(ov.isChangeLoginListener()==true){
            String arg1 = gui.changeLogin.getUsername();
            String arg2 = gui.changeLogin.getPassword();
            String arg3 = gui.changeLogin.getEmail();
            String arg4 = gui.changeLogin.getPhone();
            String [] n = {arg1,arg2,arg3,arg4};
            vm.setLoginDetails(2,n);
            ov.reset();
         }
         if(ov.isFirstSetUpListener()==true){
           vm.sendData(gui.machineSetup.getAll());
           ov.reset();
         }
         if(ov.isSlotConfigListener()==true){
           int arg1 = gui.businessSetUp.getSlotID();
           double arg2 = gui.businessSetUp.getTempRange();
           String arg3 = gui.businessSetUp.getProductName();
           double arg4 = gui.businessSetUp.getPrice();
           int arg5 = gui.businessSetUp.getQuant();
           int arg6 = gui.businessSetUp.getCurrencyType();
           
           vm.setSlot(arg1,arg2,arg3,arg4,arg5,arg6);
           vm.setConfig(1,gui.businessSetUp.getALL());
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
