package com.stackroute.pe5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UpdateSpecificElementTest {

    @Test
    public void update() {
        ArrayList<String> strings=new ArrayList();
        strings.add("Apple");
        strings.add("Grape");
        strings.add("Melon");
        strings.add("Berry");
        ArrayList<String> result=UpdateSpecificElement.update(strings,"Apple","kiwi");
        String[] testSample={"kiwi","Grape","Melon","Berry"};
        assertArrayEquals(testSample,result.toArray());
    }
    @Test
    public void update2() {
        ArrayList<String> strings=new ArrayList();
        strings.add("Apple");
        strings.add("Grape");
        strings.add("Melon");
        strings.add("Berry");
        ArrayList<String> result=UpdateSpecificElement.update(strings,"Apple","Papaya");
        String[] testSample={"Papaya","Grape","Melon","Berry"};
        assertArrayEquals(testSample,result.toArray());

    }
    @Test
    public void update3() {
        ArrayList<String> strings=new ArrayList();
        strings.add("Apple");
        strings.add("Grape");
        strings.add("Melon");
        strings.add("Berry");
        ArrayList<String> result=UpdateSpecificElement.update(strings,"Grape","Papaya");
        String[] testSample={"Apple","Papaya","Melon","Berry"};
        assertArrayEquals(testSample,result.toArray());
    }
}