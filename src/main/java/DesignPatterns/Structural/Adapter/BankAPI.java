package main.java.DesignPatterns.Adapter;

public interface BankAPI {
    double getBalance(String accountNum);
    boolean sendMoney(
            String fromAccount,
            String toAccount,
            double amount
    );
}
