package day24;

public class removeElement {
    public static void main(String[] args) {

    }
    public static int[] arr (int[]array, int index){
        if (index<0|| index>array.length-1){
            System.out.println("invalid index");
        }
        int[]result=new int[array.length-1];
        int j=0;
        for (int i=0;i<array.length;i++){
            if (i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }
}
