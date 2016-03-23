import java.util.*;
import java.sql.*;
public class EasyVending{
	public static void main (String [] args)throws SQLException{
       
       DatabaseHelper helper =  new DatabaseHelper();
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