package cs5800.assignment1.utils.inheritance;
import cs5800.assignment1.utils.inheritance.Employee;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee() {
        this.setFirstName("");
        this.setLastName("");
        this.setSocialSecurityNumber("");
        this.setWeeklySalary(0.00);
    }

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSocialSecurityNumber(socialSecurityNumber);
        this.setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return this.weeklySalary;
    }

    public void print() {
        System.out.println(this.firstName + " " + this.lastName + " (" + this.socialSecurityNumber +"): Weekly Salary: $" + this. weeklySalary);
    }
}
