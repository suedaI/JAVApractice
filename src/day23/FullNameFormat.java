package day23;

import java.util.Locale;

public class FullNameFormat {
    public static void main(String[] args) {
        fullname("sueda","iSlak");
    }
    public static void fullname(String firstname,String lastname){
        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();
        String fullname=firstname+ " "+lastname;
        System.out.println("fullname= "+fullname);
    }
}
