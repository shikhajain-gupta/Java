package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringSpecialChar {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        char[] ch1 = new char[ch.length];

        // Step 1: Place special characters at correct positions
        for (int i = 0; i < ch.length; i++) {
            if (!Character.isLetterOrDigit(ch[i])) {
                ch1[i] = ch[i];
            }
        }

        // Step 2: Place alphanumeric characters in reverse
        for (int i = 0, j = ch.length - 1; i < ch.length; i++) {
            if (Character.isLetterOrDigit(ch[i])) {
                while (j >= 0) {
                    if (Character.isLetterOrDigit(ch[j])) {
                        ch1[i] = ch[j];
                        j--;
                        break;
                    }
                    j--;
                }
            }
        }

        // Step 3: Print result
        System.out.println("Reversed (preserving special characters):");
        System.out.println(new String(ch1));
    }

//        if (Character.isLetterOrDigit(ch[i])) {
//            for (int j = ch.length - 1; j >= 0; j--) {
//                if (Character.isLetterOrDigit(ch[j]) && Character.isLetterOrDigit(ch[i])) {
//                    ch1[i] = ch[j];
//                    i++;
//
//                } else {
//                    ch1[i] = ch[i];
//                    i++;
//
//                }
//
//            }
//
//        } else {
//            ch1[i] = ch[i];
//            i++;
//        }
//        System.out.println(Arrays.toString(ch1));
//    }
}
