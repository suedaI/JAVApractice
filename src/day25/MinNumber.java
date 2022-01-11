package day25;

public class MinNumber {

    public static int[] min(int[]array){
        int min=0;
        for (int each : array) {
            if (each<min){
                min=each;
            }
        }
        return new int[]{min};
    }



}
