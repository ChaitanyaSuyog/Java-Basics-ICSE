// Program 30 - WAP to find the sum of the series 1/x + 1/x^2 + 1/x^3 +... upto the nth term.

package src.online;

import java.util.Scanner;

public class SumOfSeries30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms and the value of x: ");
        int n = scan.nextInt();
        double x = scan.nextDouble();

        double sum = 0d;

        for (int i = 1; i <= n; i++) {
            double eq = 1/Math.pow(x, i);
            sum = sum + eq;
        }
        System.out.println(sum);
    }
}
