package day20;

import java.util.Arrays;

public class FollowingArrays {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

      int indexnumGlow=-1;
      boolean hasIpad=false;
      String report="";


      for (int i=0;i<items.length;i++){
          String itemName=items[i];
          double itemPrice=prices[i];
          int itemId=itemIDs[i];
          if (itemName.equals("Gloves")){
              indexnumGlow=i;
          }
          if (itemName.equals("ipdad")){
              hasIpad=true;
          }
          report += itemName +" - "+itemPrice+" - #"+itemId+"\n";

      }
        System.out.println("report = " + report);
        System.out.println("hasIpad = " + hasIpad);
        System.out.println("indexnumGlow = " + indexnumGlow);
        System.out.println("itemIDs = " + itemIDs);
    }
}
