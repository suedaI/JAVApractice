package day28;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeLevel {
    public static void main(String[] args) {
        ArrayList<Integer>score =new ArrayList<>();
        score.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
        ArrayList<Integer>gradeOfA=new ArrayList<>();
        ArrayList<Integer>gradeOfB=new ArrayList<>();
        ArrayList<Integer>gradeOfC=new ArrayList<>();
        ArrayList<Integer>gradeOfD=new ArrayList<>();
        ArrayList<Integer>gradeOfF=new ArrayList<>();


for (Integer each: score){
    if (each>=90){
        gradeOfA.add(each);
    }else if (each>=80){
        gradeOfB.add(each);
    }else if (each>=70){
        gradeOfC.add(each);
    }else if (each>=60){
        gradeOfD.add(each);
    }else{
        gradeOfF.add(each);
    }
}

        System.out.println("gradeOfF = " + gradeOfF);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("gradeOfA = " + gradeOfA);




    }
}
