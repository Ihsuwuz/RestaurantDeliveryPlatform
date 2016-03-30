/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

public class VendingMachine extends EVSystem{
   
    private Slot[] slots = new  Slot[20];
    
    public VendingMachine(){
      Slot tmp;
      int len = slots.length;
      for(int i=0;i<len;i++){
          tmp = new Slot();
        slots[i]= tmp;
      }
    }
    public void startInterface(){
    
    }
    public void setSlot(int slotID,double tempRange,String name,double price,int quantity,int currType){
        Product product = new Product(name,price,quantity,currType);
        slots[slotID].setIsUsed(true);
        slots[slotID].setProduct(product);
        slots[slotID].setTemperatureRange(tempRange);
        setSlots(slots);
    }
    public Slot[] getSlot(){
      return this.slots;
    }
    @Override
    public void reorder() {
        throw new UnsupportedOperationException("Not supported yet."); 
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void errorMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validateLogin(String username, String password) {
        String tmp="";
        database.dBopen();
        tmp = database.getPassword(username, username);
        if(tmp==""){
         return true;
        }
        else{
         return false;
        }
    }

    @Override
    public void setLoginDetails(int tableID, String[]n) {
        database.dBopen();
        database.insertTable(n, tableID);
        database.dBclose();
    }

    @Override
    public void listenConnect() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getConfig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setConfig(int tableID,String[] dbUpdate) {
         database.dBopen();
         database.insertTable(dbUpdate, tableID);
         database.dBclose();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendData(String [] data) {
        // maybe some MQTT here well see
    }

    @Override
    public Slot[] getSlots() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSlots(Slot[] slots) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}