package main.java.ContestDSA;

import java.util.HashMap;

public class LongestSubarrayWithSumB {
    public static int findLengthOfLongestSubArrayWithSum(int []arr, int n, int b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;
        for (int i =0; i < n; i++) {
            sum += arr[i];

            if(sum == b) {
                maxLength = i+1;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if(map.containsKey(sum-b)) {
                if (maxLength < i-map.get(sum-b)) {
                    maxLength = i - map.get(sum-b);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int b = 15;
//        findLengthOfLongestSubArrayWithSum(arr, n, b);
        System.out.println(findLengthOfLongestSubArrayWithSum(arr,n, b));
    }
}
