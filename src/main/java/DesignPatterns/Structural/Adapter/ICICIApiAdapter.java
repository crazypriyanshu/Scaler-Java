package main.java.DesignPatterns.Adapter;

public class ICICIApiAdapter implements BankAPI{
    ICICIBakAPI iciciBakAPI = new ICICIBakAPI();

    public double getBalance(String accountBalance) {
        return 0;

    }

    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        System.out.println("Sending Money => " + amount + " in $$ From ICICI Bank Adapter from Account: "+ fromAccount+ " to Account "+ toAccount);
        return false;
    }
}
