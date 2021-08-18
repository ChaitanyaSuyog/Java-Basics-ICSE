//Program 26 - WAP to find if the number given is prime or no.

package src;

import java.util.Scanner;

public class FindPrime26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count <=2) {
            System.out.println("The number is prime.");
        }
        else {
            System.out.println("The number is not prime.");
        }
    }
}
