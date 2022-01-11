package ouiz1;

public class cookies {
    public static void main(String[] args) {
        int cookie = 10;
        String day= "tuesday";
        switch (day) {
            case "sunday":
                cookie++;
            case "monday":
                cookie += 5;
            case "tuesday":
            case "wednesday":
                cookie += 10;
            case "thursday":
                cookie += 5;
                break;
            case "friday":

                break;
            case "saturday":
                cookie--;
                break;
            default:
                cookie = 0;
        }
                System.out.println(cookie);

        System.out.println("-----");
String str = "";
int num=20;
switch (num){
    case 0 :
        str= "C#";
        break;
    case 10:
        str +="is";
    case 15:
        str = "fun";
    case 20:
        str += "java";
    case 25:
        str +="is";
        break;
    case 30:
        str += "fun";
        break;
    case 35:
        str = "python;" ;
                case 40:
                str += "90";
}
        System.out.println(str);
    }
}
