//Program 34- WAP to reverse a given number.

package src;

import java.util.Scanner;

public class ReverseNumber34 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n = new Scanner(System.in).nextInt();

        int digit = 0, rev = 0;
        while (n != 0) {
            digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }
        System.out.println("Original number: " + n);
        System.out.println("Reversed number: " + rev);
    }
}
