package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class ModifytheMap {
    public static Map<String,String> modify(HashMap<String,String> hm)
    {
      hm.put("val2",hm.get("val1"));
      hm.put("val1"," ");
     return hm;
    }
}
