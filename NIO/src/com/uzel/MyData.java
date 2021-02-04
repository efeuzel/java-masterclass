package com.uzel;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MyData {
    private HashMap<String, Integer> map = new LinkedHashMap();

    public MyData() {
        map.put("Efe", 1);
        map.put("UZEL", 2);
    }

    public String getContents() {
        return map.toString();
    }
}
