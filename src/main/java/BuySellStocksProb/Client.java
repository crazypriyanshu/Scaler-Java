package main.java.BuySellStocksProb;

public class Client {
    public static void main(String[] args) {
        BuySellStock obj = new BuySellStock();
        int [] A = {1, 4, 5, 2, 4};
        int val = obj.maxProfit(A);
        System.out.println(val);
    }
}
