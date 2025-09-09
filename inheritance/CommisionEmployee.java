class CommisionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommisionEmployee() {
        this.setFirstName("");
        this.setLastName("");
        this.setSocialSecurityNumber("");
        this.setCommisionRate(0.00);
        this.setGrossSales(0.00);
    }

    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSocialSecurityNumber(socialSecurityNumber);
        this.setCommisionRate(commissionRate);
        this.setGrossSales(grossSales);
    }

    public void setCommisionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommisionRate() {
        return this.commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return this.grossSales;
    }

    public void print() {
        System.out.println(this.firstName + " " + this.lastName + " (" + this.socialSecurityNumber +"): Commission Rate: " + (this.commissionRate * 100) + "% | Gross Sales: $" + this.grossSales);
    }
}