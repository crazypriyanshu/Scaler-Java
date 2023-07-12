package main.java.ContestDSA;

import java.util.ArrayList;

public class SmallerThanCurrentNumber {
//    public static int [] CountSmallerThanCurrent(int []nums) {
//        int []bucket = new int[1000];
//
//        for(int i =0; i< nums.length; i++) {
//            bucket[nums[i]] += 1;
//        }
//        for (int j =1; j <= 999; j++) {
//            bucket[j] += bucket[j-1];
//        }
//
//        for(int k = 0; k < nums.length; k++) {
//            int pos = nums[k];
//            nums[k] = pos == 0 ? 0: bucket[pos-1];
//        }
//
//        return nums;
//    }
    public static ArrayList<Integer> numbersSmallerThanCurrent(int [] arr){
        int hash[] = new int[1000];
        ArrayList<Integer> sum1 = new ArrayList<>();

        for(int i = 0; i< arr.length; i++) {
            hash[arr[i]]++;
        }
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for (int j = 1; j< 1000; j++) {
            hash[j] += hash[j-1];
        }
        for(int i = 0; i< arr.length; i++) {
            if (arr[i] == 0)
            {
//                System.out.println("0");
                sum1.add(0);
                continue;
            }

            // Print the resultant count
            sum1.add(hash[arr[i] - 1]);
        }
        return sum1;

    }


    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 2, 8, 9, 6, 11};
//        System.out.println(CountSmallerThanCurrent(arr));
        System.out.println(numbersSmallerThanCurrent(arr));
    }
}
