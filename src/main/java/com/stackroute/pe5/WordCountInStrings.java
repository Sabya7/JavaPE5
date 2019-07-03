package com.stackroute.pe5;
//a program to find the number of counts in the following String. Store the output in
//Map<String,Integer> as key value pair.
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCountInStrings {
    public static Map<String,Integer>frequency(String s)
    {    String regex="[^a-zA-Z]";         //not letters
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(s);
        s=matcher.replaceAll(" ").trim();    // replaces non letters with space
        Map<String, Integer> hm = new HashMap<String, Integer>();
        String[] strings=s.split("\\s+");
        for (String i :strings) {
            Integer j = hm.get(i);
            hm.put(i,(j == null) ? 1 : j + 1);
        }
        return hm;
    }
}
