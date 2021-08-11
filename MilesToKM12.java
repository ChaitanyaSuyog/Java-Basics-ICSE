//Program 12- WAP to convert and display the distance given in miles to kilometers.

import java.util.Scanner;

public class MilesToKM12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the distance in miles:");
        double miles = scan.nextDouble();

        double kilometers = 1.60934d;
        double finalKm = miles * kilometers;

        System.out.println("The distance is " + finalKm + " kilometers.");
    }
}
