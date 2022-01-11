package day36;

public class Iphone extends Phonee {

    public void call(long phoneNumber) {
        System.out.println(brand + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(brand + model + " is texting " + phoneNumber);
    }

    public void freeze() {
        System.out.println(brand + model + " is freeze");
    }

    public void faceTime(long phoneNumber) {
        System.out.println(brand + model + " has faceTime " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(brand + model + " has faceTime " + email);
    }


}
