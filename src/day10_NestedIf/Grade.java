package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {

        char ch='C';
        String result="";
        boolean validgrade=(ch>='A' && ch<='D') || ch=='F';

        if(validgrade){

            if (ch=='A'){
                result="excelent";

            }else if (ch=='B'){
                result="great job";
            }else if (ch=='C'){
                result="good";

            }else if (ch=='D'){
                result="passed";

            }else{
                result="faild";
            }


        }else{
            result="invalid number";
        }

        System.out.println(result);


    }
}
