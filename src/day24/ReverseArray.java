package day24;

public class ReverseArray {
    public static void main(String[] args) {

    }
    public static int[] arr(int[]array, int num){
        int[]result=new int[array.length];
        int j=0;
        for (int i=array.length-1;i>=0;i--){
            result[j++]=array[i];
        }
        return result;
    }
}
