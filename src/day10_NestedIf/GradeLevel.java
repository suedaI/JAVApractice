package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {

byte number=15;
String garadelevel="";
boolean validNumber=number>=1 &&number<=18;
if (validNumber) {
    if (number>=17){
       garadelevel="Grad scholl";
    }else if (number>=13){
        garadelevel="collage";
    }else if (number>=9){
        garadelevel="high school";

    }else if (number>=6){
      garadelevel  ="middle school";
    }else if (number>=1) {
        garadelevel = "elementry school";
    }
}  else{
    System.out.println("invalid number");
}


        System.out.println(garadelevel);




























    }
}
