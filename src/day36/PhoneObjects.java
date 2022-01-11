package day36;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        iphone.setInfo("apple","iphone13","xmax","blue",1200);
        iphone.faceTime("sueda.ekedn");
        iphone.text(38475758);
        System.out.println(iphone);
    }
}
