package com.uzel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MySerializableClass implements Serializable {
    private final long serialVersionUID = 1;
    private HashMap<String, Integer> map = new LinkedHashMap<>();

    public MySerializableClass() {
        //put in some sample data
        map.put("Efe", 1);
        map.put("Emra", 2);
    }

    public String contents() {
        return map.toString();
    }
}
