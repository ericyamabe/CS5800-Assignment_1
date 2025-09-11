package cs5800.assignment1;

import cs5800.assignment1.utils.inheritance.*;
import cs5800.assignment1.utils.INTERFACE.*;
import cs5800.assignment1.utils.polymorphism.*;
import cs5800.assignment1.utils.aggregation.*;
import cs5800.assignment1.utils.composition.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** Inheritance *****\n");
        Main.inheritance();

        System.out.println("\n\n***** Interface *****\n");
        Main.interfaceExample();

        System.out.println("\n\n***** Polymorphism *****\n");
        Main.polymorphism();

        System.out.println("\n\n***** Aggregation Step 2 *****\n");
        Main.aggregation();

        System.out.println("\n\n***** Composition *****\n");
        Main.composition();
    }

    public static void inheritance() {
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32.0);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47.0);
        CommisionEmployee nicole = new CommisionEmployee("Nicole", "Dior", "444-44-4444", .15, 50000.00);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.00);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.00);
        CommisionEmployee mahnaz = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", .22, 40000);

        joe.print();
        stephanie.print();
        mary.print();
        nicole.print();
        renwa.print();
        mike.print();
        mahnaz.print();
    }

    public static void interfaceExample() {
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

    public static void polymorphism() {
        Ship[] shiplist = new Ship[3];

        shiplist[0] = new Ship("USS Bonhomme Richard", 1995);
        shiplist[1] = new CruiseShip("Disney Magic", 1998, 2713);
        shiplist[2] = new CargoShip("Atlantic Causeway", 1969, 14946);

        for(Ship singleShip : shiplist) {
            singleShip.print();
        }

        int shiplistSize = shiplist.length;
        System.out.println("shiplist array size: " + shiplistSize);
    }

    public static void aggregation() {
        Instructor instructorNimaDavarpanah = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructorCyberProfessor = new Instructor("Cyber", "Professor", "1-1234");
        Textbooks textbookCleanCode = new Textbooks("Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin", "Pearson");
        Textbooks textbookCyberResilience = new Textbooks("Cyber Resilience – Defence-in-depth principles", "Alan Calder", "IT Governance Publishing");
        Course course = new Course();
        course.setInstructor(instructorNimaDavarpanah);
        course.setTextbooks(textbookCleanCode);
        course.setInstructor(instructorCyberProfessor);
        course.setTextbooks(textbookCyberResilience);
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

        phpDemo.print(0);
    }
}
