//Program 32 - WAP to find the sum of the given numbers : x/1! - x^2/2! + x^3/3! - x^4/4!... upto n terms

package src.online;

import java.util.Scanner;

public class SumSeriesFactorial32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of x and the number of terms: ");
        double x = scan.nextDouble();
        int num = scan.nextInt();

        double sum = 0d;
        int f = 1;

        for (int i = 1; i <= num; i++) {
            f = f * i;
            if (i % 2 != 0) {
                sum = sum + ((Math.pow(x, i)) / f);
            }
            else {
                sum = sum - ((Math.pow(x, i)) / f);
            }
        }
        System.out.println(sum);
    }
}
