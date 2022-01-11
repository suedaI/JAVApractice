package Day33;

import com.sun.tools.attach.AgentInitializationException;

public class CydeoStudents {
    public String name;
    public int age,id,batchNumber,groupNumber;
    public char gender;
    public static String schoolName="Cydeo";
    public static String programingLanguage="Java";

    public CydeoStudents(String name, int age, int id, int batchNumber, int groupNumber, char gender) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                '}';
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" is attending class");
    }

    public static void printSchoolName(){
        System.out.println("School Name: " + schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("Programming Language: " + programingLanguage);
    }



}
