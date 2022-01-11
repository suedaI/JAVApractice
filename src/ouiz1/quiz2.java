package ouiz1;

public class quiz2 {
    public static void main(String[] args) {


int num =-5;
        System.out.println(num-- + ",");
        System.out.println(num=0);
        System.out.println(","+ --num);
        System.out.println("----");
short s= 13 - 9 / 3 * 10;
s += -10;
        System.out.println(s);
        System.out.println("-------");
boolean one= ('a' != 'z') && false;
boolean two = one || 0== (9-10+1);
        System.out.println(two);

        System.out.println("-------");
long l = 100;
short s1 =(short) l;
        System.out.println(s1+10);

        System.out.println("---");
        short a1= 13+ 3* (10-6) %2;
        boolean b1= a1 != 25;
        System.out.println(b1);
        System.out.println("------");
        byte w = 104;
        boolean check = w< 100;
        if (check){
            w-= 100;

        }else{
            w=50;
        }
        System.out.println(w);

        System.out.println("---");

        if (183 == 13 + 50 * 2 + 70){
            System.out.println("java");
        }else{
            System.out.println("soft skill");
        }


    }
}
