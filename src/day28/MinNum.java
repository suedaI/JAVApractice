package day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinNum {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
       int b= Collections.min(list);

        System.out.println(b);
    }
}
