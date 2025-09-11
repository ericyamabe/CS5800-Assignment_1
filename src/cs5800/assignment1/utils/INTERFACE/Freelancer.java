package cs5800.assignment1.utils.INTERFACE;
import cs5800.assignment1.utils.INTERFACE.Payable;

public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer() {
        this.setFirstName("");
        this.setLastName("");
        this.hourlyRate = 0.00;
        this.hoursWorked = 0.00;
    }

    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHourlyRate(hourlyRate);
        this.setHoursWorked(hoursWorked);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String setLastName() {
        return this.lastName;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate > 0) {
            this.hourlyRate = hourlyRate;
        } else {
            this.hourlyRate = 0.00;
            System.out.println("Rate cannot be a negative number.");
        }
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        if(hoursWorked > 0){
            this.hoursWorked = hoursWorked;
        } else {
            this.hoursWorked = 0.0;
            System.out.println("Hours worked cannot be a negative number.");
        }
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public double calculatePayment() {
        double payment = 0.00;

        if(this.hoursWorked > 0 && this.hourlyRate > 0) {
            if(this.hoursWorked > 40) {
                double overtime = this.hoursWorked - 40;
                payment = (this.hourlyRate * 40) + ((this.hourlyRate * 1.5) * overtime);
            } else {
                payment = this.hourlyRate * hoursWorked;
            }
        }

        return payment;
    }

    public String getPayeeName() {
        return this.firstName + " " + this.lastName;
    }

    public void print() {
        System.out.println("Freelancer's Name: " + this.getPayeeName() + " | Payment: $" + this.calculatePayment());
    }
}
