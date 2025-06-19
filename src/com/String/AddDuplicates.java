package com.String;

import java.util.HashMap;

public class AddDuplicates {
    public static void main(String[] args) {
        String s = "a3b2c5";
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<s.length();i=i+2)
        {
            char a =s.charAt(i+1);
            int num = Character.getNumericValue(a);

            for(int j=0;j<num;j++)
            {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
