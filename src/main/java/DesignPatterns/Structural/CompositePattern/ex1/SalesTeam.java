package main.java.DesignPatterns.Structural.CompositePattern.ex1;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {
//    private List<Manager> managers = new ArrayList<>();
//    private List<SalesPerson> salesPeople = new ArrayList<>();

//    void addManager(Manager manager) {
//        managers.add(manager);
//    }
//    void addSalesPerson(SalesPerson salesPerson) {
//        salesPeople.add(salesPerson);

    private List<Payee> payees = new ArrayList<>();
    public void addPayee(Payee payee) {
        payees.add(payee);


    }
    public void payExpenses(int amount) {
        payees.forEach(payee -> payee.payExpenses(amount));
    }
}
