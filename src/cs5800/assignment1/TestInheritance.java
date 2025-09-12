package cs5800.assignment1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import cs5800.assignment1.utils.inheritance.*;

public class TestInheritance {
    public final SalariedEmployee salariedEmployee = new SalariedEmployee();
    public final HourlyEmployee hourlyEmployee = new HourlyEmployee();
    public final BaseEmployee baseEmployee = new BaseEmployee();
    public final CommisionEmployee commisionEmployee = new CommisionEmployee();

    protected final String firstName = "John";
    protected final String lastName = "Doe";
    protected final String ssn = "555-55-5555";

    @Test
    void testSalariedEmployee() {
        // Variable Setup
        final double weeklySalary = 1000.00;

        this.salariedEmployee.setFirstName(this.firstName);
        this.salariedEmployee.setLastName(this.lastName);
        this.salariedEmployee.setSocialSecurityNumber(this.ssn);
        this.salariedEmployee.setWeeklySalary(weeklySalary);

        assertEquals(this.salariedEmployee.getFirstName(), this.firstName);
        assertEquals(this.salariedEmployee.getLastName(), this.lastName);
        assertEquals(this.salariedEmployee.getSocialSecurityNumber(), this.ssn);
        assertEquals(this.salariedEmployee.getWeeklySalary(), weeklySalary);
    }

    @Test
    void testHourlyEmployee() {
        // Variable Setup
        final double numHoursWorked = 20.00;
        final double hourlyWage = 20.00;

        // Setup objects
        this.hourlyEmployee.setFirstName(this.firstName);
        this.hourlyEmployee.setLastName(this.lastName);
        this.hourlyEmployee.setSocialSecurityNumber(this.ssn);
        this.hourlyEmployee.setWage(hourlyWage);
        this.hourlyEmployee.setNumberHoursWorked(numHoursWorked);

        // Start testing
        assertEquals(this.hourlyEmployee.getFirstName(), this.firstName);
        assertEquals(this.hourlyEmployee.getLastName(), this.lastName);
        assertEquals(this.hourlyEmployee.getSocialSecurityNumber(), this.ssn);
        assertEquals(this.hourlyEmployee.getNumberHoursWorked(), numHoursWorked);
        assertEquals(this.hourlyEmployee.getWage(), hourlyWage);
    }

    @Test
    void testBaseEmployee() {
        // Variable Setup
        final double baseSalary = 60000.00;

        // Setup objects
        this.baseEmployee.setFirstName(this.firstName);
        this.baseEmployee.setLastName(this.lastName);
        this.baseEmployee.setSocialSecurityNumber(this.ssn);
        this.baseEmployee.setBaseSalary(baseSalary);

        // Start testing
        assertEquals(this.baseEmployee.getFirstName(), this.firstName);
        assertEquals(this.baseEmployee.getLastName(), this.lastName);
        assertEquals(this.baseEmployee.getSocialSecurityNumber(), this.ssn);
        assertEquals(this.baseEmployee.getBaseSalary(), baseSalary);
    }

    @Test
    void testCommisionEmployee() {
        // Variable Setup
        final double rate = 10.00;
        final double grossSales = 100000;

        // Setup objects
        this.commisionEmployee.setFirstName(this.firstName);
        this.commisionEmployee.setLastName(this.lastName);
        this.commisionEmployee.setSocialSecurityNumber(this.ssn);
        this.commisionEmployee.setCommisionRate(rate);
        this.commisionEmployee.setGrossSales(grossSales);

        // Start testing
        assertEquals(this.commisionEmployee.getFirstName(), this.firstName);
        assertEquals(this.commisionEmployee.getLastName(), this.lastName);
        assertEquals(this.commisionEmployee.getSocialSecurityNumber(), this.ssn);
        assertEquals(this.commisionEmployee.getCommisionRate(), rate);
        assertEquals(this.commisionEmployee.getGrossSales(), grossSales);
    }
}
