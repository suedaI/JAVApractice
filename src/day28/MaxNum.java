package day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxNum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
     int a=   Collections.max(list);
        System.out.println(a);

    }
}
