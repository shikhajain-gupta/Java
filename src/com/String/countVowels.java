package com.String;

import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {

        System.out.println("Enter  string");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = a.trim();
        String b1=b.replaceAll("[^a-zA-Z0-9]","");
        String c = b1.toLowerCase();
        System.out.println(c);

        int size = c.length();
        char[] v = {'a', 'e', 'i', 'o', 'u'};
        int vowels = 0;
        int consonent = 0;
        for (int i = 0; i <= size-1; i++) {
            for (int j = 0; j <= v.length-1; j++) {
                if (c.charAt(i) == v[j]) {
                    vowels++;
                }
            }
                }
        consonent = size-vowels;
        System.out.println("Vowels are:" + vowels);
        System.out.println("consonents are:" + consonent);
    }
}