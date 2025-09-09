public class Driver {
    public static void main(String[] args) {
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
}