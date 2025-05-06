package examples;

import java.util.Scanner;

public class ReverseNumber  {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int reverse = 0;

    while (num != 0) {
        int a = num % 10;
        num = num / 10;
        reverse = reverse * 10 + a;
    }
    System.out.println("reversed no is " + reverse);

}
}
