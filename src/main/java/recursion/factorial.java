package main.java.recursion;

public class factorial {
    public static void main(String[] args) {
        int n = 3;
        long factorial = multiplyNum(n);
        System.out.println(" Factorial is "+ factorial);

    }

    public static long multiplyNum(int num) {
        if(num > 1) {
            return num * (multiplyNum(num-1));
        }
        else {
            return 1;
        }
    }
}
