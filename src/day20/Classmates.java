package day20;

import java.util.Arrays;

public class Classmates {
    public static void main(String[] args) {


        String[] mylist = {"sueda", "maxim", "danial", "andiria", "hakan", "wahii", "alina", "alexandra"};

        for (int i = 0; i < mylist.length; i++) {
            String intial=mylist[i].charAt(0)+"."+mylist[i].charAt(mylist[i].indexOf("")+1);
            System.out.println(intial);
        }



    }
}