package com.String;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {

        System.out.println("Enter String");
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();

        String s1= s.replaceAll("[\\s+]", " ").trim();

        String[] s2=s1.split(" ");

        StringBuilder sb= new StringBuilder();
        for(String s3: s2)
        {
            char[] ch=s3.toCharArray();
            for(int i=ch.length-1;i>=0;i--)
            {
                sb.append(ch[i]);
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
