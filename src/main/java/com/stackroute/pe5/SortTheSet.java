package com.stackroute.pe5;
//a program to implement set interface which sorts the given randomly ordered names in
//ascending order. Convert the sorted set in to an array list
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortTheSet {
    public static ArrayList<String> setSorter(String s)
    {
        String[] arr=s.split(" ");
        Set<String> treeSet= new TreeSet<>();
        for (String a:arr)
        {
            treeSet.add(a);
        }
        return new ArrayList<>(treeSet);
    }
}
