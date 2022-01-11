package day23;

public class ElegibleToVote {
    public static void main(String[] args) {
        vote(21,false);
    }
    public static void vote(int age,boolean citizen){
        if ((age >= 18 && citizen) == true){
            System.out.println("you are eligible to vote.");
        }else{
            System.out.println("you are not eligible to vote.");
        }
    }
}
