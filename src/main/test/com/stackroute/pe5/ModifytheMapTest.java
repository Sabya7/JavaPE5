package com.stackroute.pe5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifytheMapTest {

    @Test
    public void modify() {
        HashMap<String,String> hm= new HashMap<String,String>();
        hm.put("val1","java");
        hm.put("val2","c++");
        String result =ModifytheMap.modify(hm).toString();
        assertEquals("{val2=java, val1= }",result);
    }

    @Test
    public void modify2() {
        HashMap<String,String> hm= new HashMap<String,String>();
        hm.put("val1"," ");
        hm.put("val2"," ");
        String result =ModifytheMap.modify(hm).toString();
        assertEquals("{val2= , val1= }",result);
    }
    @Test
    public void modify3() {
        HashMap<String,String> hm= new HashMap<String,String>();
        hm.put("val1","c++");
        hm.put("val2","c++");
        String result =ModifytheMap.modify(hm).toString();
        assertEquals("{val2=c++, val1= }",result);
    }
}