/*Program 21 - A pre-paid taxi charges the passenger upon the given tariff:

               Up to 5 km - Rs. 100
               For the next 10 km - Rs. 10/km
               For the next 10 km - Rs. 8/km
               More than 25 km - Rs. 5 km

               Display:
               Taxi no.: ______
               Distance Covered: ______
               Amount: ______
 */

package src;

import java.util.Scanner;

public class Taxi21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the taxi number: ");
        String taxiNo = scan.nextLine();

        System.out.println("Enter the distance covered: ");
        double s = scan.nextDouble();

        double amt = 0d;

        if (s <= 5) {
            amt = s * 100;
        }
        else if (s > 5 && s <= 10) {
            amt = 100 + (s - 5) * 10;
        }
        else if (s > 15 && s <= 20) {
            amt = 100 + (10 * 10) + (s - 15) * 8;
        }
        else if (s > 25) {
            amt = 100 + (10 * 10) + (20 * 8) + (s -25) * 5;
        }
        else {
            System.out.println("Invalid input.");
        }
        System.out.println("Taxi No.: " + taxiNo + "\nDistance Covered: " + s + "\nAmount: " + amt);
    }
}

