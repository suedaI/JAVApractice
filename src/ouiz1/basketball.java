package ouiz1;

import java.util.IllegalFormatCodePointException;

public class basketball {
    public static void main(String[] args) {

        boolean isTall = true;
        boolean isFast = false;
        boolean isFlexible = false;
        String sport = "";
        if (isTall) {
            if (isFast) {
                sport = "basketball";
            }else if (isFlexible) {
                sport = "gym";
            }else{
                sport = "volleyball";

            }

        }else{
            if (isFast) {
                sport = "soccer";

            }else{
                sport = "tennis";
            }
        }
        System.out.println(sport);







    }
}
