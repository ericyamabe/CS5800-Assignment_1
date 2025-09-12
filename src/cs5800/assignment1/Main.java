package cs5800.assignment1;

import cs5800.assignment1.utils.inheritance.*;
import cs5800.assignment1.utils.INTERFACE.*;
import cs5800.assignment1.utils.polymorphism.*;
import cs5800.assignment1.utils.aggregation.*;
import cs5800.assignment1.utils.composition.*;

public class Main {
    public static void main(String[] args) {
        // Output Inheritance Class
        System.out.println("***** Inheritance *****\n");
        Main.inheritance();

        // Output Interface Class
        System.out.println("\n\n***** Interface *****\n");
        Main.interfaceExample();

        // Output Polymorphism Class
        System.out.println("\n\n***** Polymorphism *****\n");
        Main.polymorphism();

        // Output Aggregation
        System.out.println("\n\n***** Aggregation Step 2 *****\n");
        Main.aggregation();

        // Output Composition
        System.out.println("\n\n***** Composition *****\n");
        Main.composition();
    }

    public static void inheritance() {
        // Setup Objects
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32.0);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47.0);
        CommisionEmployee nicole = new CommisionEmployee("Nicole", "Dior", "444-44-4444", .15, 50000.00);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.00);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.00);
        CommisionEmployee mahnaz = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", .22, 40000);

        // Print
        joe.print();
        stephanie.print();
        mary.print();
        nicole.print();
        renwa.print();
        mike.print();
        mahnaz.print();
    }

    public static void interfaceExample() {
        // Setup variables
        Payable[] payableList = new Payable[4];
        double totalPayout = 0.00;

        // initiate objects and setup payable list
        payableList[0] = new Freelancer("Stephanie", "Smith", 25.00, 32.0);
        payableList[1] = new Freelancer("Mary", "Quinn", 19.00, 47.0);
        payableList[2] = new VendorInvoice("Joe Jones Co.", "100003", 2500.00);
        payableList[3] = new VendorInvoice("Renwa Chanel Corp.", "24234234", 1700.00);

        // Loop thorugh each payable item and calculate the total payout.
        for(Payable payableItem : payableList) {
            payableItem.print();
            totalPayout = totalPayout + payableItem.calculatePayment();
        }

        // Output the total payout.
        System.out.println("Total Payout: $" + totalPayout);
    }

    public static void polymorphism() {
        // Setup variables
        Ship[] shiplist = new Ship[3];

        // set up shiplist with ship objects.
        shiplist[0] = new Ship("USS Bonhomme Richard", 1995);
        shiplist[1] = new CruiseShip("Disney Magic", 1998, 2713);
        shiplist[2] = new CargoShip("Atlantic Causeway", 1969, 14946);

        // Loop through each type of ship and print it's information
        for(Ship singleShip : shiplist) {
            singleShip.print();
        }

        // Get the ship list size and display it.
        int shiplistSize = shiplist.length;
        System.out.println("shiplist array size: " + shiplistSize);
    }

    public static void aggregation() {
        // Setup objects
        Instructor instructorNimaDavarpanah = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructorCyberProfessor = new Instructor("Cyber", "Professor", "1-1234");
        Textbooks textbookCleanCode = new Textbooks("Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin", "Pearson");
        Textbooks textbookCyberResilience = new Textbooks("Cyber Resilience – Defence-in-depth principles", "Alan Calder", "IT Governance Publishing");
        Course course = new Course();
        course.setInstructor(instructorNimaDavarpanah);
        course.setTextbooks(textbookCleanCode);
        course.setInstructor(instructorCyberProfessor);
        course.setTextbooks(textbookCyberResilience);

        // Display the course with the given objects.
        course.print();
    }

    public static void composition() {
        // 1st Level
        Folder phpDemo = new Folder("php_demo1");
        Folder sourceFiles = phpDemo.addSubFolder("Source Files");
        Folder includePath = phpDemo.addSubFolder("Include Path");
        Folder remoteFiles = phpDemo.addSubFolder("Remote Files");

        // 2nd Level
        Folder phalcon = sourceFiles.addSubFolder(".phalcon");
        Folder app = sourceFiles.addSubFolder("app");
        Folder cache = sourceFiles.addSubFolder("cache");
        Folder publicFolder = sourceFiles.addSubFolder("public");
        sourceFiles.addFile(".htaccess");
        sourceFiles.addFile(".htrouter.php");
        sourceFiles.addFile("index.html");

        // 3rd Level
        Folder config = app.addSubFolder("config");
        Folder controllers = app.addSubFolder("controllers");
        Folder library = app.addSubFolder("library");
        Folder migrations = app.addSubFolder("migrations");
        Folder models = app.addSubFolder("models");
        Folder views = app.addSubFolder("views");

        // Display folder tree
        phpDemo.print(0);
    }
}
