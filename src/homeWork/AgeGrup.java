package homeWork;

public class AgeGrup {
    public static void main(String[] args) {
        int age = 31;
        String grubs = "";
        if (age >=0 && age <=150){
           if (age>= 0 && age < 21) {
grubs = "teenager";
           } else if (age >=21 && age <55) {
               grubs = "adult";
           }else
               grubs = "senior";


            System.out.println(grubs);

        }else{
            System.out.println("invalid");
        }




























    }
}
