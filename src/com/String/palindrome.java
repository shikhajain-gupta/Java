package com.String;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sa= sc.nextLine();
        String s1= sa.trim();
        String s=s1.replaceAll("\\s+","");
        System.out.println(s);
        char[] ch= s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=ch.length-1; i>=0; i--)
        {
            sb.append(ch[i]);
        }
        System.out.println(sb);
        if(s.equals(sb.toString()))
        {
            System.out.println("Entered string is palindrome");
        }
        else {
            System.out.println("Entered string is not palindrome");
        }
    }

}
