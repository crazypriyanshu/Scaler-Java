package main.java.ContestDSA;

import java.util.Scanner;

public class ZigZagProblem {
    public static void ans(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n+" ");
        ans(n-1);
        System.out.print(n+ " ");
        ans(n-1);
        System.out.print(n+ " ");
        return;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        ans(n);
        return;
    }
}
