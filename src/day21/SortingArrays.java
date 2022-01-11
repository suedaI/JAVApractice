package day21;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] result = new int[arr.length];

        for (int i = arr.length-1, j =0; i >=0 ; i--) {
            result[j] = arr[i];
        }

        System.out.println(Arrays.toString(result));

    }






    }

