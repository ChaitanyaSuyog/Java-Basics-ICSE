//Program 16 - WAP to find the largest out of three given numbers.

package src.online;

import java.util.Scanner;

public class MaxThree16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        double max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Maximum number = " + max);
    }
}