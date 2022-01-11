package homeWork;

public class StatusCode {
    public static void main(String[] args) {

        int code = 304;
        String result = (code == 200)? "ok" : (code== 201)? "created" :(code == 202)? "accepted"
                :(code ==301 )? "moved permanently":(code == 303)? "see other" :(code==304)? "not modifiedS"
                :(code == 400)? "bad request" :(code==401)?"unauthorized" :(code==403)? "forbidden"
                :(code==404)? "not found" :(code==410)? "gone" :(code== 500)? "internal server error"
                :(code == 503)? "service unavailable" : "temporary redicet";
        System.out.println(result );






























    }






}
