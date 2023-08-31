package main.java.DesignPatterns.Structural.CompositePattern.ex1;

public class Client {
    public static void main(String[] args) {
        Manager jane = new Manager("Jane");
        SalesPerson bob = new SalesPerson("Bob", jane);
        SalesPerson bubu = new SalesPerson("Bubu", jane);
        SalesPerson choti = new SalesPerson("Choti", jane);

        SalesTeam team = new SalesTeam();
        team.addPayee(bob);
        team.addPayee(bubu);
        team.addPayee(choti);
//        team.addManager(jane);
//        team.addSalesPerson(bob);
//        team.addSalesPerson(bubu);
//        team.addSalesPerson(choti);
//
        addPayee(jane, 100);
        addPayee(bob, 300);
        addPayee(team, 1000);
    }

    private static void addPayee(Payee payee, int amount) {
        System.out.println(" Expenses have been requested ...");
        payee.payExpenses(amount);
        System.out.println(" Expenses have been paid");

    }



//    private static void payManager(Manager manager, int amount) {
//        System.out.println(" Expenses have been requested ...");
//        manager.payExpenses(amount);
//        System.out.println(" Expenses have been paid");
//    }
//
//    private static void paySalesPerson(SalesPerson salesPerson, int amount) {
//        System.out.println(" Expenses have been requested ...");
//        salesPerson.payExpenses(amount);
//        System.out.println(" Expenses have been paid");
//    }
//
//    private static void paySalesTeam(SalesTeam salesTeam, int amount) {
//        System.out.println(" Expenses have been requested ...");
//        salesTeam.payExpenses(amount);
//        System.out.println(" Expenses have been paid");
//    }
}
