// Program 30 - WAP to find the sum of the series 1/x + 1/x^2 + 1/x^3 +... upto the nth term.

package src;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms and the value of x: ");
        int n = scan.nextInt();
        int x = scan.nextInt();

        double sum = 0d;
        int j = 1;

        for (int i = 1; i <= n; i++) {
            double power = j++;
            double eq = 1/Math.pow(x, power);
            double t = eq;
            sum = sum + t;
        }
        System.out.println(sum);
    }
}
