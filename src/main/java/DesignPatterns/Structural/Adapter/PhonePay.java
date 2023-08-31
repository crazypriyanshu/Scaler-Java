package main.java.DesignPatterns.Adapter;

public class PhonePay {
    public static void main(String[] args) {
        BankAPI bankAPI = new ICICIApiAdapter();

        String priAccountNo = "12345";
        String UrviAccountNo = "4321";
        double amount = 100.00;
        bankAPI.sendMoney(priAccountNo, UrviAccountNo, amount);

        BankAPI yesBankAdapter = new YesBankAPIAdapter();

        yesBankAdapter.sendMoney(priAccountNo, UrviAccountNo, amount);

    }
}
