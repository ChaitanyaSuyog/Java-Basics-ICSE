//Program 27 - WAP to find the factorial of a given number.

package src.online;

import java.util.Scanner;

public class FindFactorial27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();

        System.out.println("The factorial of " + number + " is:");

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
