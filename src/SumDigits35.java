//Program 34- WAP to reverse a given number.

package src;

import java.util.Scanner;

public class SumDigits35 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n = new Scanner(System.in).nextInt();

        int digit = 0, sum = 0;
        while (n != 0) {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Sum of the digits = " + sum);
    }
}
