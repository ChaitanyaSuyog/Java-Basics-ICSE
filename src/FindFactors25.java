//Program 25 - WAP to find the factors of the number given by the user.

package src;

import java.util.Scanner;

public class FindFactors25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to get its factors: ");
        int number = scan.nextInt();

        System.out.println("The factors of " + number + " are:");

        for (int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
