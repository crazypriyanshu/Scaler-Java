package main.java.DSA.subarrays.kadanesAlgo;
// Kadane's algorithm is used to find the max sub array
public class client {
    public static void main(String[] args) {
        int[] arr = {-3, -4, 5, -1, 2, -4, 6, -1};
        int maxSoFar = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i =0; i< arr.length; i++) {
            currSum += arr[i];
            if(currSum > maxSoFar) {
                maxSoFar = currSum;
            }
            if (currSum <0) {
                currSum = 0;
            }
        }

        System.out.println("Max sub array is "+ maxSoFar);
    }
}
