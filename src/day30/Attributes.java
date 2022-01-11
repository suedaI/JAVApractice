package day30;

public class Attributes {
    public String name;
    public String id;
    public char gender;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;


    public String toString() {
        return "Attributes{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo (String name, String id, char gender, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;













    }
}
