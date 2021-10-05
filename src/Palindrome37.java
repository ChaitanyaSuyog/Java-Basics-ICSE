//Program 27 - WAP to check if the given number is a palindrome or not.

package src;

import java.util.Scanner;

public class Palindrome37 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n = new Scanner(System.in).nextInt();
        int orgN = n;

        int digit = 0, rev = 0;
        do {
            digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        } while (n > 0);
        if (rev == orgN) {
            System.out.println(orgN + " is a palindrome number.");
        }
        else {
            System.out.println(orgN + " is not a palindrome number.");
        }
    }
}
