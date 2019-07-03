package com.stackroute.pe5;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class WhetherStringAppearsMoreThanOnceTest {

    @Test
    public void checkOccurences() {
        String[] arr={"a","a","b","b","b","b","c","c","c"};
        Map result=WhetherStringAppearsMoreThanOnce.checkOccurences(arr);
        assertEquals("{a=true, b=true, c=true}",result.toString());
    }

    @Test
    public void checkOccurences2() {
        String[] arr={"a","b","c"};
        Map result=WhetherStringAppearsMoreThanOnce.checkOccurences(arr);
        assertEquals("{a=false, b=false, c=false}",result.toString());
    }
}