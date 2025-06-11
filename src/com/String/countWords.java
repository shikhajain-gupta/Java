package com.String;

import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sa= sc.nextLine();
        String s= sa.trim();
        String[] str= s.split("\\s+");
        System.out.println(str.length);

    }
}
