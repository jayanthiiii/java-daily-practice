package Inheritance2;

public class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;
    public Employee(String name, double annualSalary, int yearStarted,
                    String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }
    public int getYearStarted() {
        return yearStarted;
    }
    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }
}