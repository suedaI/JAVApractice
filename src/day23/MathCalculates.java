package day23;

import java.util.IllegalFormatCodePointException;

public class MathCalculates {
    public static void main(String[] args) {

    }
    public static void calculate(int num1,int num2,char mathOpt){
String result="invalid number";

if (mathOpt=='+'|| mathOpt=='-'||mathOpt=='*'||mathOpt=='/'){
    if(mathOpt=='-'){
        result ="Subtraction: "+ (num1-num2);
    }else if(mathOpt=='+'){
        result ="Addition: "+ (num1-num2);
    }else if(mathOpt=='*'){
        result ="Multiplication: "+ (num1*num2);
    }else{
        result ="Division: "+ (num1/num2);
    }

}

        System.out.println(result);
    }
}






