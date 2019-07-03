package com.stackroute.pe5;
//a program where an array of strings is input and output is a Map<String,boolean> where
//each different string is a key and its value is true if that string appears 2 or more times in the array
import java.util.HashMap;
import java.util.Map;

public class WhetherStringAppearsMoreThanOnce {
    public static Map<String,Boolean> checkOccurences(String[] arr)
    {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        Map<String,Boolean> checkOcc=new HashMap<String, Boolean>();
        for (String i :arr) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
            int k=hm.get(i);
            checkOcc.put(i,(k>1) ? true: false);
        }
        return checkOcc;
    }
}
