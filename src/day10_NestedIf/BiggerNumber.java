package day10_NestedIf;

public class BiggerNumber {
    public static void main(String[] args) {

      int num1=34;
      int num2=56;
      int num3=68;
      String result="";
      if (num1>num2 && num1>num3){
          result="num1 is bigger";

      }else if (num2>num1 && num2>num3){
          result="num2 is bigger";

      }else{
          result="num3 is bigger";

      }

        System.out.println(result);




    }
}
