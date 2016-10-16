/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

/**
 *
 * @author Ih
 */
abstract class BillDecorator implements BillInterface {
    protected BillInterface tempBill;


    public BillDecorator(BillInterface newBill){
        tempBill = newBill;
    }
    
    @Override
    public String getBill(){
        return tempBill.getBill();
    }
}