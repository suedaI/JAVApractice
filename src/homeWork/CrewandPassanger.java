package homeWork;

import javax.swing.*;

public class CrewandPassanger {
    public static void main(String[] args) {

        int total = 50;
        String crew = "";
        String passenger = "";
        if (total >= 50 && total <= 100){


            if (total >= 50) {
                crew = " 20";
                passenger = " 30";
            } else if (total >= 51 && total <= 74) {
                crew = "25";
                passenger = "50";
            } else if (total >= 75 && total <= 99) {
                crew = "30";
                passenger="70";
            }

            System.out.println(crew + "crew" + passenger + "passenger");
    }else {
            System.out.println("invalid numbber");


}



























    }


}
