package com.Collection;

import java.util.*;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {


        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        hashMap.put("b", "banana");
        hashMap.put("a", "apple");
        hashMap.put("c", "cherry");

        linkedMap.putAll(hashMap);   // preserves insertion order
        treeMap.putAll(hashMap);     // sorts by key

        System.out.println(hashMap);

        for(Map.Entry<String, String> entry:linkedMap.entrySet()) {


            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        for(String value: treeMap.values())
        {System.out.println(value);}
    }
}
