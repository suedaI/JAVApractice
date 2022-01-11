package day11;

public class Elevator {
    public static void main(String[] args) {
int floornum=2;
String result="";
String companies="";
switch (floornum) {
    case 1:
        result = "floor 1 selected";

        break;
    case 2:
        result = "floor 2 selected";
        companies = "cybertek,nasa,intelsat";
        break;
    case 3:
        result = "floor 3 selected";
        companies = "lyft,bofa,stake house";
        break;
    default:
        System.err.println("invalid floor " + floornum);
}
        System.out.println(floornum);
        System.out.println(result);
        System.out.println(companies);




}







    }

