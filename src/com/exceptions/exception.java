package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args)  {

        int a =0;
        int b =0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
        //sc.nextLine();

        System.out.println("Enter another number");
        //Scanner sc2 = new Scanner(System.in);
        b = sc.nextInt();
       // sc.nextLine();

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }


    }
}
