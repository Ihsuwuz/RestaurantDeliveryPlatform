/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.ArrayList;

/**
 *
 * @author Anon
 */
public class SystemAdvocate extends EVSystem implements Payment {
    
    
    private SystemControl systemControl;
    private Sensor sensor;
    private ArrayList<Integer> activeWeightSensors; 
    private ArrayList<Integer> activeTemperatureSensrs;
    private int acceleratorAddress;
    private int paymentHardwareAddress;
    public SystemAdvocate(){
        this.acceleratorAddress = 42;
        this.paymentHardwareAddress=666;
        this.setSlots(slots);
        this.sensor = new Sensor();
    }
     public void setUpSystemControl(){
     
     }
     public void determineAction(){
     
     }
     public void initAction(){
         
     }
     public void disableSlot(){
        
     }
    @Override
    public void Dispense() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void refund() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accept() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendData(String[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reorder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void errorMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validateLogin(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLoginDetails(int tableID, String[] n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listenConnect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getConfig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setConfig(int tableID, String[] dbUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Slot[] getSlots() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSlots(Slot[] slots) {
       int len = slots.length;
       Slot tmp;
       int ctr =0;
       for(int i = 0;i<len;i++){
           tmp = slots[i];
         if(tmp.isIsUsed()==true){
             if(tmp.getTemperatureRange()!=0){
                this.activeTemperatureSensrs.add(ctr,i);
             }
           this.activeWeightSensors.add(ctr,i);
         }
         ctr = ctr+1;    
       }
    }
    
}
