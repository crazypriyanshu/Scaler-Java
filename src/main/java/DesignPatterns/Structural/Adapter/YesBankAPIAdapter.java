package main.java.DesignPatterns.Adapter;

public class YesBankAPIAdapter implements BankAPI{
    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double getBalance(String accountNum) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        System.out.println("Sending Money " + amount + " in Rs From YES Bank Adapter from Account: -> "+ fromAccount+ " to Account ->  "+ toAccount);
        return false;
    }
}
