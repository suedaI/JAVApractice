package day21;

public class CommonElements {
    public static void main(String[] args) {
        int[]  arr1={1,2,3,4,5};
        int[]arr2={4,5,6,7,8};

        for (int each : arr1) {
            for (int element : arr2) {
                if(each == element){
                    System.out.print(each+" ");
                }
            }
        }

        System.out.println(); // to append a new line after printing all the elements in one line





    }
}
