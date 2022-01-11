package Day12;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class SpeedCheack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter current speed:");
        int overSpeed = scan.nextInt();
        int currentSpeed = 55;
        int result = overSpeed - currentSpeed;
        if (overSpeed > currentSpeed){
            System.out.println("you are driving "+ result+ " mph over the limit slow down.");
        }else{
            System.out.println("you are driving " + result + " mph you are good.");
        }






    }
}
