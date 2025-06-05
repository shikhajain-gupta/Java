package com.String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class replaceDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        char[] ch= str.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);

        StringBuilder sb = new StringBuilder();
        LinkedHashMap<Character, Integer> linkedmap = new LinkedHashMap<>();
        for(char a: ch)
        {
            linkedmap.put(a,linkedmap.getOrDefault(a,0)+1);

        }
        System.out.println(linkedmap);

        for(Map.Entry<Character,Integer> entry : linkedmap.entrySet()){
            //System.out.println(entry.getKey()+entry.getValue());
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        System.out.println(sb);
        }
    }

