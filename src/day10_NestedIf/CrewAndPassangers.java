package day10_NestedIf;

public class CrewAndPassangers {
    public static void main(String[] args) {

        int num = 75;
        String result = "";
        boolean validnumber = num == 50 || num == 75 || num == 00;

        if (validnumber) {
            if (num == 50) {
                result = "20 crew,30 passengers";
            } else if (num == 75) {
                result = "25 crew,30 passengers";
            }else{
                    result = "30 crew,70 passengers";
                }
            } else {
                result = "invalid number";
            }

        System.out.println(result);
        }
    }
