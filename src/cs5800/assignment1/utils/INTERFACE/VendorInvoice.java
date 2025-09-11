package cs5800.assignment1.utils.INTERFACE;
import cs5800.assignment1.utils.INTERFACE.Payable;

public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice() {
        this.setVendorName("");
        this.setInvoiceNumber("");
        this.setAmountDue(0.00);
    }

    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
        this.setVendorName(vendorName);
        this.setInvoiceNumber(invoiceNumber);
        this.setAmountDue(amountDue);
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public void setAmountDue(double amountDue) {
        if(amountDue > 0) {
            this.amountDue = amountDue;
        } else {
            this.amountDue = 0.00;
            System.out.println("Amount Due cannot be a negative number.");
        }
    }

    public double calculatePayment() {
        if(this.amountDue > 0) {
            return this.amountDue;
        }

        return 0.00;
    }

    public String getPayeeName() {
        return this.vendorName;
    }

    public void print() {
        System.out.println("Vendor Name: " + this.getPayeeName() + " | Invoice Number: " + this.invoiceNumber + " | Payment: $" + this.calculatePayment());
    }
}
