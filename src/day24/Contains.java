package day24;

public class Contains {
    public static void main(String[] args) {

    }
    public static boolean contains(int[]array,int element){
        boolean result=false;
        for (int each:array){
            if (each==element){
                result=true;
            }
        }
        return result;
    }
}
