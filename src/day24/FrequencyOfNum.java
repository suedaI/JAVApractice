package day24;

public class FrequencyOfNum {
    public static void main(String[] args) {

    }
    public static int FrequencyOfNum (int[] array,int element){
        int count=0;
        for (int each:array){
            if (each==element){
                count++;
            }
        }
        return count;
    }
}
