package day31;

public class SalaryCalculator {

   public double hourlyRate,stateTaxRate,federalTaxRate,weeklyHours;



    public SalaryCalculator(double hourlyRate,double stateTaxRate,double federalTaxRate,double weeklyHours){
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;


    }
    public double salary(){
        return hourlyRate*weeklyHours*52;
    }
    public double getStateTaxRate(){
        return salary()*stateTaxRate/100;
    }
    public double getFederalTaxRate() {
        return salary()*federalTaxRate/100;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }
}


