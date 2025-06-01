package com.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateCharacters {
    public static void main(String[] args) {
        String s1 = "counting duplicates in a string";
        s1 = s1.replaceAll(" ", "");
        char[] s2 = s1.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char i : s2) {
            if(map.containsKey(i)){
            map.put(i,map.get(i)+1);
        }
            else{
                map.put(i,1);
            }

    }
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

//        Set<Character> charsInString = map.keySet();
//        System.out.println(charsInString);
//
//        for (Character ch : charsInString) {
//            if (map.get(ch) > 1) {
//                System.out.println(ch + " : " + map.get(ch));
 //           }
  //      }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
}
}
