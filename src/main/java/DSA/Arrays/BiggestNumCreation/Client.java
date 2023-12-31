package main.java.DSA.Arrays.BiggestNumCreation;

import java.util.*;

public class Client {
    static void printLargest(Vector<String> arr) {
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1o2 = o1 + o2;
                String o2o1 = o2+o1;
                return o1o2.compareTo(o2o1) > 0 ? -1: 1;
            }
        });

        Iterator it = arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }

    public static void main(String[] args) {
        Vector<String> arr;
        arr = new Vector<>();
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printLargest(arr);
    }
}
