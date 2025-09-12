package cs5800.assignment1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import cs5800.assignment1.utils.INTERFACE.*;

public class TestInterface {
    public final Freelancer freelancer = new Freelancer();
    public final VendorInvoice venderInvoice = new VendorInvoice();

    @Test
    void testFreelancer() {
        // Variable Setup
        final String firstName = "John";
        final String lastName = "Doe";
        final double hourlyRate = 20.0;
        final double hoursWorked = 40.0;

        // Setup objects
        this.freelancer.setFirstName(firstName);
        this.freelancer.setLastName(lastName);
        this.freelancer.setHourlyRate(hourlyRate);
        this.freelancer.setHoursWorked(hoursWorked);

        // Start testing
        assertEquals(this.freelancer.getFirstName(), firstName);
        assertEquals(this.freelancer.getLastName(), lastName);
        assertEquals(this.freelancer.getHourlyRate(), hourlyRate);
        assertEquals(this.freelancer.getHoursWorked(), hoursWorked);
    }

    @Test
    void testVendorInvoice() {
        // Variable Setup
        String vendor = "Acme Inc.";
        String invoiceNumber = "A3423";
        double amountDue = 1000.00;

        // Setup objects
        this.venderInvoice.setVendorName(vendor);
        this.venderInvoice.setInvoiceNumber(invoiceNumber);
        this.venderInvoice.setAmountDue(amountDue);

        // Start testing
        assertEquals(this.venderInvoice.getVendorName(), vendor);
        assertEquals(this.venderInvoice.getInvoiceNumber(), invoiceNumber);
        assertEquals(this.venderInvoice.getAmountDue(), amountDue);

    }
}
