package main.java.recursion;

import java.util.ArrayList;

public class Backtracking {

    private boolean[] marked;
    private ArrayList<ArrayList<Integer>> res;
    private ArrayList<Integer> arr;
    private int n;

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        n = A.size();
        marked = new boolean[n];
        res = new ArrayList<>();
        this.arr = A;
        recurse(0, new ArrayList<>());
        return res;
    }
    public void recurse(int index, ArrayList<Integer> temp) {
        if (index == n) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i =0; i< n; i++) {
            if(!marked[i]) {
                marked[i] = true;
                temp.add(arr.get(i));
                recurse(index+1, temp);
                marked[i] = false;
                temp.remove(temp.size()-1);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0, 1);
        arr.add(1, 2);
        arr.add(2, 3);
        Backtracking b = new Backtracking();
        b.permute(arr);


    }
}
