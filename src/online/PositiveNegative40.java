//Program 40 - WAP to add the numbers if they are both positive, or break if either of them are negative.

package src.online;

import java.util.Scanner;

public class PositiveNegative40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter two numbers: ");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            if (num1 >= 0 && num2 >= 0) {
                int sum = num1 + num2;
                System.out.println("Sum of the numbers = " + sum);
            }
            else {
                break;
            }
        }
    }
}
