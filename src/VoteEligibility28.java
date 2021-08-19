//Program 28 - WAP to input the name and age of the user and check if he is eligible for voting or no.

package src;

import java.util.Scanner;

public class VoteEligibility28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name and age:");
        String name = scan.nextLine();
        double age = scan.nextDouble();

        if (age > 0 && age < 18) {
            System.out.println("You are not eligible to vote.");
        }
        else if (age > 0 && age >= 18) {
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("Invalid input.");
        }
    }
}
