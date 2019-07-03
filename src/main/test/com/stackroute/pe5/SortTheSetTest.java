package com.stackroute.pe5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTheSetTest {

    @Test
    public void setSorter() {
        String result=SortTheSet.setSorter("D C B A").toString();
        assertEquals("[A, B, C, D]",result);
    }
    @Test
    public void setSorter1() {
        String result=SortTheSet.setSorter("Har Har Mahadev").toString();
        assertNotEquals("[A, B, C, D]",result);
    }
    @Test
    public void setSorter2() {
        String result=SortTheSet.setSorter("").toString();
        assertEquals("[]",result);
    }

}