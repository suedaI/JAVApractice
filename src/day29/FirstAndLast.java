package day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstAndLast {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(9, 8, 7, 6, 5));
        System.out.println(list);
        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list);


        System.out.println("==================================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list2);

        int size = list2.size();

        list2.removeAll( Arrays.asList(0)  );

        System.out.println(list2);

        int newSize = list2.size();

        int totalNumberOfZeros = size - newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list2.add(0);
        }

        System.out.println(list2);

        System.out.println("-----------------------------------------------------------");

















    }
}
