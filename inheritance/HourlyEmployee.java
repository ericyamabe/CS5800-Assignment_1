class HourlyEmployee extends Employee {
    private double wage;
    private double numberHoursWorked;

    public HourlyEmployee() {
        this.setFirstName("");
        this.setLastName("");
        this.setSocialSecurityNumber("");
        this.setWage(0.00);
        this.setNumberHoursWorked(0.00);
    }

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double numberHoursWorked) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSocialSecurityNumber(socialSecurityNumber);
        this.setWage(wage);
        this.setNumberHoursWorked(numberHoursWorked);
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return this.wage;
    }

    public void setNumberHoursWorked(double numberHoursWorked) {
        this.numberHoursWorked = numberHoursWorked;
    }

    public double getNumberHoursWorked() {
        return this.numberHoursWorked;
    }

    public void print() {
        System.out.println(this.firstName + " " + this.lastName + " (" + this.socialSecurityNumber +"): Hourly Wage: $" + this.wage + " | Numbers Hours Worked: " + this.numberHoursWorked);
    }
}