package day31;

public class Address {
    public int buildingNumber,zipCode;
    public String state,city,street;

  public Address(int buildingNumber,int zipCode,String state,String city,String street){
      this.buildingNumber=buildingNumber;
      this.street=street;
      this.zipCode=zipCode;
      this.city=city;
      this.state=state;

  }

    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", zipCode=" + zipCode +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

