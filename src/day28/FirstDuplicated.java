package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        System.out.println(list);
int firstDuplicated=0;
        for (Integer each : list) {

            int frequency=0;
            for (Integer element:list){
                if (each==element){
                    frequency++;
                }
            }
            if (frequency>1){
                firstDuplicated=each;
                break;
            }
        }
        System.out.println("firstDuplicated = " + firstDuplicated);

    }
}
