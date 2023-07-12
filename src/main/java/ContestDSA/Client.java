package main.java.ContestDSA;

import java.util.Arrays;

public class Client {
        static int getMaxProduct(int arr[], int n) {
            if (n < 3) {
                return -1;
            }
            Arrays.sort(arr);
            return Math.max(arr[0] * arr[1] * arr[n-1], arr[n-1] * arr[n-2] * arr[n-3]);
        }

    public static void main(String[] args) {
        int []arr = { 1, 4, 3, -6, -7, 0 };
        int n = arr.length;
        int maxProd = getMaxProduct(arr, n);
        System.out.println(maxProd);

    }
}
