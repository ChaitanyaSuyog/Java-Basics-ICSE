/* Program 31 - WAP (menu-driven) to:
   1. Find the sum of the given series x/1 + x/3 + x/5 +... upto n terms.
   2. To generate Fibonacci series upto n terms -  0, 1, 1, 2, 3, 5, 8, 13..
 */

package src;

import java.util.Scanner;

public class FibonacciSeries31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 to find the sum of the series, 2 for Fibonacci series.");
        int taskNo = scan.nextInt();
        int n;

        switch (taskNo) {
            case 1:
                System.out.println("Enter the value of x and the number of terms:");
                float x = scan.nextFloat();
                n = scan.nextInt();

                float sum = 0f;
                int dr = 1;

                for (int i = 0; i < n; i++) {
                    sum = sum + (x/dr);
                    dr += 2;
                }
                break;
            case 2:
                System.out.println("Enter the number of terms: ");
                n = scan.nextInt();

                int a = 0;
                int b = 1;
                int c;

                if (n == 1) {
                    System.out.println(a);
                }
                else if (n == 2) {
                    System.out.println(a);
                    System.out.println(b);
                }
                else if (n > 2) {
                    System.out.println(a);
                    System.out.println(b);
                    for (int i = 2; i < n; i++) {
                        c = a + b;
                        System.out.println(c);
                        a = b;
                        b = c;
                    }
                }
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
