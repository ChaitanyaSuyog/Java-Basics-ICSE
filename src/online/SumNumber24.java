//Program 24 - WAP to find the sum of all numbers entered by the user.

package src.online;

import java.util.Scanner;

public class SumNumber24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to add?");
        int noOfNumbers = scan.nextInt();

        double sum = 0;
        System.out.println("Enter the " + noOfNumbers + " numbers.");

        for (int i = 0; i < noOfNumbers; i++) {
            double numbers = scan.nextDouble();
            sum = sum + numbers;
        }

        System.out.println("Sum = " + sum);
    }
}
