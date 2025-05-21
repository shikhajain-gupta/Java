package com.String;

public class stringReverse {
    public static void main(String[] args) {
        String a = "Hello World";
        char[] b = a.toCharArray();
        int c = b.length;
        StringBuilder sb = new StringBuilder();
        for(int i =c-1;i>=0;i--)
        {
            sb.append(b[i]);
        }
        System.out.println(sb);
    }
}
