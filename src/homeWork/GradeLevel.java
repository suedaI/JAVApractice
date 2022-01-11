package homeWork;

public class GradeLevel {
    public static void main(String[] args) {

        byte num = 11;
        String level = "";
        if (num >= 1 && num <= 18) {
            if (num >= 1 && num <= 5) {
                level = "elementry";
            } else if (num >= 6 && num <= 8) {
                level = "middle school";
            } else if (num >= 9 && num <= 12) {
                level = "high school";
            } else if (num >= 13 && num >= 16) {
                level = "college";
            } else
                level = "grad school";
        }else {
            System.out.println("invalid grade number given.");
        }
        System.out.println(level );



    }

    }















