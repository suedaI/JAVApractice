package day10_NestedIf;

public class HttpTasks {
    public static void main(String[] args) {
        int code = 200;
        String result = (code == 200) ? "ok" : (code == 201) ? "created" : (code == 202) ? "accepted" : (code == 301) ? "moved permanently" : (code == 303) ? "see other"
                : (code == 304) ? "not modified" : (code == 307) ? "temporary redirect" : (code == 400) ? "bad request" : (code == 401) ? "unauthorized" : (code == 403) ? "forbiden"
                : (code == 404) ? "not found" : (code == 410) ? "gone" : (code == 500) ? "internal server error" : "service unavailable";

        System.out.println(result);


    }
}