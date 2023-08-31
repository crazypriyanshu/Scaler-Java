package main.java.recursion;

import java.util.Arrays;

public class Heap_Algo {
    int temp_array[];
    int finalArray[];
    void print_array(int array[], int size) {

        for (int i = 0; i< size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
    void createArray(int arr[], int size) {
        for (int i = 0; i< size; i++) {
            Arrays.stream(temp_array).toArray();
        }
        Arrays.stream(finalArray).toArray();
    }
    void heap_permutation(int array[], int size, int n) {
        if (size ==1) {
            createArray(array, n);
            print_array(array, n);
        }
        for (int i=0; i< size; i++) {
            heap_permutation(array, size-1, n);

            if(size % 2 == 1) {
                int temp = array[0];
                array[0] = array[size-1];
                array[size-1] = temp;
            }
            else {
                int temp = array[i];
                array[i] = array[size-1];
                array[size-1] = temp;
            }
        }


    }
    public static void main(String[] args) {
        Heap_Algo obj = new Heap_Algo();
        int a[] = {1, 2, 3};
        obj.heap_permutation(a, a.length, a.length);
        System.out.println(obj.finalArray);

    }
}
