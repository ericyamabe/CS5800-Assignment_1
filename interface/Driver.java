public class Driver {
    public static void main(String[] args) {
        Payable[] payableList = new Payable[4];
        double totalPayout = 0.00;

        payableList[0] = new Freelancer("Stephanie", "Smith", 25.00, 32.0);
        payableList[1] = new Freelancer("Mary", "Quinn", 19.00, 47.0);
        payableList[2] = new VendorInvoice("Joe Jones Co.", "100003", 2500.00);
        payableList[3] = new VendorInvoice("Renwa Chanel Corp.", "24234234", 1700.00);

        for(Payable payableItem : payableList) {
            payableItem.print();
            totalPayout = totalPayout + payableItem.calculatePayment();
        }

        System.out.println("Total Payout: $" + totalPayout);
    }
}