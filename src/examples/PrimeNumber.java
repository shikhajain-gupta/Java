package examples;

import java.util.Scanner;

public class PrimeNumber {
    //public boolean isPrime;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        boolean isPrime = true;
        //PrimeNumber pm = new PrimeNumber();

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;

            } else {
                isPrime = true;


            }
        }
        System.out.println("===========");
        //System.out.println(pm.isPrime);


        if (isPrime) {
            System.out.println(num + "is a prime number");
        } else {
            System.out.println(num + "is not a prime number");
        }
    }
}

