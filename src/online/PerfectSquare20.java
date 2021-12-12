//Program 20 - WAP to find out if the given two numbers are perfect squares or not.

package src.online;

import java.util.Scanner;

public class PerfectSquare20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double aSqrt = Math.sqrt(a);
        double bSqrt = Math.sqrt(b);

        double checkASqr = aSqrt - (Math.floor(aSqrt));
        double checkBSqr = bSqrt - (Math.floor(bSqrt));

        if (checkASqr == 0 && checkBSqr == 0) {
            System.out.println("Both the numbers are perfect squares.");
        }
        else if (checkASqr == 0 && checkBSqr != 0) {
            System.out.println(a + " is a perfect square, " + b + " is not a perfect square.");
        }
        else if (checkASqr != 0 && checkBSqr == 0 ) {
            System.out.println(a + " is not a perfect square, but " + b + " is a perfect square.");
        }
        else {
            System.out.println("None of the numbers are perfect squares.");
        }
    }
}
