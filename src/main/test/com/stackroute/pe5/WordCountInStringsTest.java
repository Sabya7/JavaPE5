package com.stackroute.pe5;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class WordCountInStringsTest {

    @Test
    public void frequency() {
        Map result=WordCountInStrings.frequency("one one -one___two,,three,one @three*one?two");
        assertEquals("{one=5, two=2, three=2}",result.toString());
    }
    @Test
    public void frequency2() {
        Map result=WordCountInStrings.frequency("one1 one!_one@#");
        assertEquals("{one=3}",result.toString());
    }
    @Test
    public void frequency3() {
        Map result=WordCountInStrings.frequency("22two@#!one!_one@#");
        assertEquals("{one=2, two=1}",result.toString());
    }
}