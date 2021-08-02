/* Program 19 - WAP to input the name, customer ID and number of units consumed
by the user and calculate and displat the bill amount as per the table below:

Upto 100 units = Rs 5.50 / unit
For next 200 units = Rs 5.50 / unit
For next 300 units = Rs 6.50 / unit
More than 600 units = Rs 7.50 / unit
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class BillAmount19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        System.out.println("Enter your customer ID: ");
        System.out.println("Enter the number of units consumed: ");

        String name = scan.nextLine();
        String customerID = scan.nextLine();
        int unitsConsumed = scan.nextInt();
        float charges;
        float billAmount;

        if (unitsConsumed > 0 && unitsConsumed <= 100) {
            charges = 5.50f;
            billAmount = charges * unitsConsumed;
            System.out.println("Your bill amount = Rs." + billAmount);
        }
        else if (unitsConsumed > 100 && unitsConsumed <= 300) {
            charges = 6.50f;
            billAmount = 100 * 5.50f + (unitsConsumed - 100) * charges;
            System.out.println("Your bill amount = Rs." + billAmount);
        }
        else if (unitsConsumed > 300 && unitsConsumed <= 600) {
            charges = 7.50f;
            billAmount = (100 * 5.50f) + (200 * 6.50f) + (unitsConsumed - 300) * charges;
            System.out.println("Your bill amount = Rs." + billAmount);
        }
        else if (unitsConsumed > 600 && unitsConsumed <= 1200) {
            charges = 8.50f;
            billAmount = (100 * 5.50f) + (200 * 6.50f) + (300 * 7.50f) + (unitsConsumed - 600) * charges;
            System.out.println("Your bill amount = Rs." + billAmount);
        }
        else {
            throw new InputMismatchException("Invalid input.");
        }
    }
}
