package main.java.CollectionPackDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
        Set<String> myset = new HashSet<>();
        Set<Integer> myDLLset = new LinkedHashSet<>();
        myset.add("China");
        myset.add("India");
        myset.add("US");
        System.out.println(myset);
        myDLLset.add(4);
        myDLLset.add(5);
        myDLLset.add(7);
        myDLLset.add(12);
        System.out.println(myDLLset);


    }

    private void setExample(Set myset) {
        myset.add("China");
        myset.add("India");
        myset.add("US");
        System.out.println(myset);
    }
}
