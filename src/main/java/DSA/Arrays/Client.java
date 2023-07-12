// Given an array, which contains 1's and 0's , find the sub array when flipped can give maximum 1's in the entire array
//

package main.java.DSA.Arrays;

public class Client {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 1, 1, 0, 1};

        int start = 0;
        int end = 0;
        int current_count = 0;
        int max_count = 0;
        int current_start = 0;

        for(int i= 0; i< arr.length; i++) {
            if(arr[i] == 1) {
                current_count++;
            }
            else {
                current_count--;
                if(current_count <0) {
                    current_count = 0;
                    current_start = i+1;
                }
            }
            if(current_count > max_count) {
                max_count = current_count;
                start = current_start;
                end = i;
            }

        }
        System.out.println("Maximum Flipped Subarray:");
        System.out.println("Starting index of Subarray:" + start);
        System.out.println("Ending index of Subarray:" + end);

        for (int i = start; i<= end; i++) {
            if(arr[i] == 0) {
                System.out.print("1");
            }
            else {
                System.out.print("O");

            }
        }

    }
}
