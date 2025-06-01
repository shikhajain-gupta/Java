package examples;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int j=0;
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact=1;

        for(int i=1;i<=n;i++)
        {
            fact=fact*i;

        }
        System.out.println(fact);
    }
}
