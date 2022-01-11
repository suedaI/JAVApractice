package Day12;

import java.util.Scanner;

public class MilToKm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the miles ");
double mil = scan.nextDouble();
        double km = mil * 1.6;
        System.out.println(mil + " miles equal to "+ km + "kilometers");



    }
}
