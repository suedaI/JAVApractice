package day10_NestedIf;

public class AgeGroup {
    public static void main(String[] args) {


        int age=27;
        String result="";
        boolean validnum= age>=0 &&age<=150;
        if (validnum){

            if (age<=21){
                result="teenageer";
            }else if (age>=21 &&age<55){
                result="adult";
            }else{
                result="senior";
            }

        }else{
            result="invalid number";
        }
        System.out.println(result);
    }
}
