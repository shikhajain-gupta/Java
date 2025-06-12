package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {

        //remove spaces
        //convert to lowercase
        //convert to array and sort it
        //compare both strings

        System.out.println("Enter first string");
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        String b = a.trim();
        String c= b.replaceAll("\\s+","");
        String d = c.toLowerCase();
        char[] ch= d.toCharArray();
        Arrays.sort(ch);
        String e = new String(ch);
        //System.out.println(e);

        System.out.println("Enter second string");
        Scanner sc1= new Scanner(System.in);
        String a1 = sc1.nextLine();
        String b1 = a1.trim();
        String c1= b1.replaceAll("\\s+","");
        String d1 = c1.toLowerCase();
        char[] ch1= d.toCharArray();
        Arrays.sort(ch1);
        String e1 = new String(ch1);
       //System.out.println(e1);

        if(e.equals(e1))
        {
            System.out.println("both strings are anagrams");
        }
        else
        {
            System.out.println("both strings are not anagrams");
        }
    }
}
