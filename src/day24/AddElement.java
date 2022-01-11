package day24;

public class AddElement {
    public static void main(String[] args) {

    }
    public static int[] addelement(int[]array,int element){
        int[]result=new int [array.length+1];
        int i=0;
        for (int each:array){
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }

}
