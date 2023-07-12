package main.java.Java_Strings;

public class Moral {
    public static void main(String[] args) {
        int n = 100000;
        fun1(n);
        
    }
    static void fun1(int n) {
        long starting = System.currentTimeMillis();
        String s = "";
        for (int i =1; i<= n; i++) {
            s += i;
        }
        long ending = System.currentTimeMillis();
        long duration = ending - starting;
        System.out.println("For a loop of size " + n + ", time taken = " + duration);
    }
    static void fun2(int n) {
        long starting = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i =1; i<= n; i++) {
            sb.append(i);
        }
        long ending = System.currentTimeMillis();
        long duration = ending - starting;
        System.out.println("For a loop of size " + n + ", time taken = " + duration);
    }
}
