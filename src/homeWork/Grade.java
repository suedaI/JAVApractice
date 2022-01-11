package homeWork;

public class Grade {

    public static void main(String[] args) {

        char given = 'A';
        String result = "";
        if (given == 'A' || given == 'B' || given == 'C' || given == 'D' || given == 'F') {

            if (given == 'A') {
                result = "excellent";

            } else if (given == 'B') {
                result = "great job";

            } else if (given == 'C') {
                result = "good";

            } else if (given == 'D') {
                result = "passed";

            } else {
                result = "faild";
            }

            System.out.println(result);


        } else {
            System.out.println("invalid");
        }


    }


}
