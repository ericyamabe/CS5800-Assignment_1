class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee() {
        this.setFirstName("");
        this.setLastName("");
        this.setSocialSecurityNumber("");
        this.setBaseSalary(0.00);
    }

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSocialSecurityNumber(socialSecurityNumber);
        this.setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void print() {
        System.out.println(this.firstName + " " + this.lastName + " (" + this.socialSecurityNumber + "): Base Salary = $" + this.baseSalary);
    }
}