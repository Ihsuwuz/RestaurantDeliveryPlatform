package easyvendingdb;

import java.util.*;
import java.sql.*;
public class EasyVending {

  public static final DatabaseHelper helper =  new DatabaseHelper();

	public static void main (String [] args)throws SQLException{
       
         helper.dBopen();
       createAndInserts();
       helper.dBclose();
       
       helper.dBopen();
       getDataUpdateData();
       helper.dBclose();

       helper.dBopen();
       testOutPut();
       helper.dBclose();
       
     
       
       helper.dBopen();
       testOutPut();
       helper.dBclose();
      //helper.dBclose();
      
	}
  public static void getDataUpdateData(){

    System.out.println("##########################  GET AND UPDATE    ##########################");
    System.out.println("Getting Data");
    System.out.println(helper.getPassword("Benjamin","dummy@mail.com"));

    String test = helper.getPassword("Benjamin","dummy@mail.cm");
    if(test!=null || test!=""){
      System.out.println("NOT NULL");
    }
    else{

       if(test==null){
        System.out.println("IS NUUL");
       }
       else if (test==""){
        System.out.println("Is empty String");
      }
    }
    System.out.println("Update operations");
                  String [] tab1={"SLOT_CONFIG","PRODUCT_NAME","NewProductName","1"};
              helper.updateTable(tab1);
              String [] tab2={"SLOT_CONFIG","QUANTITY","20","1"};
              helper.updateTable(tab2);
              String [] tab3={"SLOT_CONFIG","PRICE","2000","1"};
              helper.updateTable(tab3);
              String []tab4={"SLOT_CONFIG","TEMP_RANGE","230","1"};
              helper.updateTable(tab4);
              String []tab5={"SLOT_CONFIG","PRICE","23.90","1"};
              helper.updateTable(tab5);
              String []tab6={"SLOT_CONFIG","CURRENCY_ID","1","1"};
              helper.updateTable(tab6);
              String []tab7={"SLOT_CONFIG","PRODUCT_NAME","NewProductName","2"};
              helper.updateTable(tab7);
              String []tab8={"SLOT_CONFIG","QUANTITY","20","2"};
              helper.updateTable(tab8);
              String []tab9={"SLOT_CONFIG","PRICE","2000","2"};
              helper.updateTable(tab9);
              String []tab10={"SLOT_CONFIG","TEMP_RANGE","230","2"};
              helper.updateTable(tab10);
              String []tab11={"SLOT_CONFIG","PRICE","23.90","2"};
              helper.updateTable(tab11);
              String []tab12={"SLOT_CONFIG","CURRENCY_ID","1","2"};
              helper.updateTable(tab12);
              String []tab13={"SLOT_CONFIG","PRODUCT_NAME","NewProductName","3"};
              helper.updateTable(tab13);
              String []tab14={"SLOT_CONFIG","QUANTITY","20","3"};
              helper.updateTable(tab14);
              String []tab15={"SLOT_CONFIG","PRICE","2000","3"};
              helper.updateTable(tab15);
              String []tab16={"SLOT_CONFIG","TEMP_RANGE","230","3"};
              helper.updateTable(tab16);
              String []tab17={"SLOT_CONFIG","PRICE","23.90","3"};
              helper.updateTable(tab17);
              String []tab18={"SLOT_CONFIG","CURRENCY_ID","1","3"};
              helper.updateTable(tab18);
              String []tab19={"SLOT_CONFIG","PRODUCT_NAME","NewProductName","4"};
              helper.updateTable(tab19);              
              String []tab20={"SLOT_CONFIG","QUANTITY","20","4"};
              helper.updateTable(tab20);
              String []tab21={"SLOT_CONFIG","PRICE","2000","4"};
              helper.updateTable(tab21);
              String []tab22={"SLOT_CONFIG","TEMP_RANGE","230","4"};
              helper.updateTable(tab22);
              String []tab23={"SLOT_CONFIG","PRICE","23.90","4"};
              helper.updateTable(tab23);
              String []tab24={"SLOT_CONFIG","CURRENCY_ID","1","4"};
              helper.updateTable(tab24);
              String []tab25={"SLOT_CONFIG","PRODUCT_NAME","NewProductName","5"};
              helper.updateTable(tab25);
              String []tab26={"SLOT_CONFIG","QUANTITY","20","5"};
              helper.updateTable(tab26);
              String []tab27={"SLOT_CONFIG","PRICE","2000","5"};
              helper.updateTable(tab27);
              String []tab28={"SLOT_CONFIG","TEMP_RANGE","230","5"};
              helper.updateTable(tab28);
              String []tab29={"SLOT_CONFIG","PRICE","23.90","5"};
              helper.updateTable(tab29);
              String []tab30={"SLOT_CONFIG","CURRENCY_ID","1","5"};
              helper.updateTable(tab30);

              String []tab31={"TECHNICIAN","USERNAME","NewUserName","1"};
              helper.updateTable(tab31);
              String []tab32={"TECHNICIAN","PASSWORD","FUCK","1"};
              helper.updateTable(tab32);
              String []tab33={"TECHNICIAN","EMAIL","fuck@mail.com","1"};
              helper.updateTable(tab33);
              String []tab34={"TECHNICIAN","PHONE","0864053174","1"};
              helper.updateTable(tab34);
              String []tab35={"TECHNICIAN","USERNAME","NewUserName","2"};
              helper.updateTable(tab35);
              String []tab36={"TECHNICIAN","PASSWORD","FUCK","2"};
              helper.updateTable(tab36);
              String []tab37={"TECHNICIAN","EMAIL","fuck@mail.com","2"};
              helper.updateTable(tab37);
              String []tab38={"TECHNICIAN","PHONE","0864053174","2"};
              helper.updateTable(tab38);
              String []tab39={"TECHNICIAN","USERNAME","NewUserName","3"};
              helper.updateTable(tab39);
              String []tab40={"TECHNICIAN","PASSWORD","FUCK","1"};
              helper.updateTable(tab40);
              String []tab41={"TECHNICIAN","EMAIL","fuck@mail.com","3"};
              helper.updateTable(tab41);
              String []tab42={"TECHNICIAN","PHONE","0864053174","3"};
              helper.updateTable(tab42);
              String []tab43={"TECHNICIAN","USERNAME","NewUserName","4"};
              helper.updateTable(tab43);
              String []tab44={"TECHNICIAN","PASSWORD","FUCK","4"};
              helper.updateTable(tab44);
              String []tab45={"TECHNICIAN","EMAIL","fuck@mail.com","4"};
              helper.updateTable(tab45);
              String []tab46={"TECHNICIAN","PHONE","0864053174","4"};
              helper.updateTable(tab45);
  }

  public static void testOutPut(){
  System.out.println("##########################  TEST UPDATES  ##########################");
   ArrayList<String> testDB = new ArrayList<String>();

      testDB = helper.getMachineConfig();
       int len = testDB.size();
       for(int i =0;i<len;i++){
         System.out.println(testDB.get(i));
       }
       testDB = helper.getIncidents();
       for(int j =0;j<len;j++){
         System.out.println(testDB.get(j));
       }
   


  }

  public static void createAndInserts(){
   System.out.println("##########################  Create And Iserts ##########################");
       helper.createDataBase();
       helper.deleteTable(1);
       helper.deleteTable(2);
       helper.deleteTable(3);
       helper.deleteTable(4);
       ArrayList<String> testDB = new ArrayList<String>();

       String [] SC={"1","Mars","4","1.50","0","0","91"};
       String [] TCH={"1","Benjamin","1234","dummy@mail.com","086946352"};
       String [] INC={"1","22.3.2016","Vandalism","Email","12.90","12.90"};
       String [] AC={"22.3.2016","22.50"};

       helper.insertTable(SC,1);
       System.out.println("still here");
       helper.insertTable(TCH,2);
       System.out.println("still here");
       helper.insertTable(INC,3);
       System.out.println("still here");
       helper.insertTable(AC,4);
       System.out.println("still here");


       String [] SC2={"2","Mars","4","1.50","0","0","1"};
       String [] TCH2={"2","Benjamin","1234","dummy@mail.com","086946352"};
       String [] INC2={"2","22.3.2016","Vandalism","Email","12.90","12.90"};
       String [] AC2={"22.3.2016","22.50"};

       helper.insertTable(SC2,1);
       helper.insertTable(TCH2,2);
       helper.insertTable(INC2,3);
       helper.insertTable(AC2,4);

       String [] SC3={"3","Mars","4","1.50","0","0","1"};
       String [] TCH3={"3","Benjamin","1234","dummy@mail.com","086946352"};
       String [] INC3={"3","22.3.2016","Vandalism","Email","12.90","12.90"};
       String [] AC3={"22.3.2016","22.50"};

       helper.insertTable(SC3,1);
       helper.insertTable(TCH3,2);
       helper.insertTable(INC3,3);
       helper.insertTable(AC3,4);

       String [] SC4={"4","Mars","4","1.50","0","0","1"};
       String [] TCH4={"4","Benjamin","1234","dummy@mail.com","086946352"};
       String [] INC4={"4","22.3.2016","Vandalism","Email","12.90","12.90"};
       String [] AC4={"22.3.2016","22.50"};

        helper.insertTable(SC4,1);
        helper.insertTable(TCH4,2);
        helper.insertTable(INC4,3);
        helper.insertTable(AC4,4);

       String [] SC5={"5","Mars","4","1.50","0","0","1"};
       String [] TCH5={"5","Benjamin","1234","dummy@mail.com","086946352"};
       String [] INC5={"5","22.3.2016","Vandalism","Email","12.90","12.90"};
       String [] AC5={"22.3.2016","22.50"};

        helper.insertTable(SC5,1);
        helper.insertTable(TCH5,2);
        helper.insertTable(INC5,3);
        helper.insertTable(AC5,4);

       String [] SC6={"6","Mars","4","1.50","0","0","1"};
       String [] TCH6={"6","Benjamin","1234","dummy@mail.com","086946352"};
       String [] INC6={"6","22.3.2016","Vandalism","Email","12.90","12.90"};
       String [] AC6={"22.3.2016","22.50"};

       helper.insertTable(SC6,1);
       helper.insertTable(TCH6,2);
       helper.insertTable(INC6,3);
       helper.insertTable(AC6,4);
       testDB = helper.getMachineConfig();
       int len = testDB.size();
       for(int i =0;i<len;i++){
         System.out.println(testDB.get(i));
       }
       testDB = helper.getIncidents();
       for(int j =0;j<len;j++){
         System.out.println(testDB.get(j));
       }

  }
}