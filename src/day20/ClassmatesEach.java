package day20;

public class ClassmatesEach {
    public static void main(String[] args) {

        String[] classmates = {"sueda", "maxim", "danial", "andiria", "hakan", "wahii", "alina", "alexandra"};

        for (int i = 0; i < classmates.length; i++) {
            String name=classmates[i];
            String reservename="";
            for (int j=name.length()-1;j>=0;j--){
                reservename+=name.charAt(j);
            }
            System.out.println(reservename);
        }
    }
}
