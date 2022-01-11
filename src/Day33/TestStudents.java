package Day33;

public class TestStudents {
    public static void main(String[] args) {

    

        CydeoStudents students1=new CydeoStudents("sueda",29,2567,25,30,'F');
        CydeoStudents students2=new CydeoStudents("hakan",18,2311,25,30,'M');

        System.out.println(students2);
        System.out.println(students1);

        students1.printSchoolName();
        students2.printSchoolName();

        students1.printProgLanguage();
        students2.printProgLanguage();



    }
}
