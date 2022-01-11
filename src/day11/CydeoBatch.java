package day11;

public class CydeoBatch {
    public static void main(String[] args) {
        String batchType="US morning";
        switch (batchType){

            case "US morning":
                System.out.println("class times are 10-5 est.monday to friday");
            break;
            case "US evening":
                System.out.println("class time are 7-10 est. monday to sunday");
            break;
            case "EU":
                System.out.println("class time are 10-5 est. moday to saturday");
            break;
            default:
                System.out.println("invalid batch");


        }
    }
}
