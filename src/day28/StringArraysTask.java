package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArraysTask {
    public static void main(String[] args) {
        String [] arr1={"A","B","C"};
String[]arr2={"D","E","F","G"};
ArrayList<String> list=new ArrayList<>();
        for (String s : arr1) {
            list.add(s);
        }
        for (String s : arr2) {
            list.add(s);
        }

        System.out.println("list = " + list);
        



    }
}
