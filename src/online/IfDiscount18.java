/* Program 18 -
   WAP to input the total cost and display the amount to be paid and the
   gift the customer received.
   Upto Rs. 2000 = 20 % Discount, free Bag
   Rs. 2001 to Rs. 5000 = 30%, free wall clock
   Above Rs. 5000 = 40%, free watch
 */

package src.online;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfDiscount18 {

    public static void main(String[] args) {
        float discount;
        int totalCost;
        float finalBill;
        Scanner scan = new Scanner(System.in);
        totalCost = scan.nextInt();

        if (totalCost > 0 && totalCost < 2000) {
            discount = (float) (totalCost * 20 / 100);
            finalBill = totalCost - discount;
            System.out.println("Your discount is Rs." + finalBill + ", and you receive a bag as a gift!");
        }
        else if (totalCost > 2000 && totalCost < 5000) {
            discount = (float) (totalCost * 30 / 100);
            finalBill = totalCost - discount;
            System.out.println("Your discounted amount is Rs." + finalBill + ", and you receive a wall clock as a gift!");
        }
        else if (totalCost >= 5000) {
            discount = (float) (totalCost * 40 / 100);
            finalBill = totalCost - discount;
            System.out.println("Your discount is Rs." + finalBill + ", and you receive a watch as a gift!");
        }
        else {
            throw new InputMismatchException("Invalid input.");
        }
    }
}
