/* Question - Write a program to check whether a given number is a duck number or not.
   Hint: A number is said to be a duck number if it contains zero. But th enumber 0 should not be in the initial position.
   For example- 1509, 4024, 7780 are duck numbers, whereas 012, 0934 are not.
 */

package src.preboard23;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = scan.next();
        if (num.charAt(0) == 0) {
            System.out.println(num + " is not a duck number.");
            System.exit(0);
        }

        int n = Integer.parseInt(num);
        boolean found = false;
        while (n > 0) {
            if (n % 10 == 0) {
                found = true;
                break;
            }
            n = n / 10;
        }

        if (found) {
            System.out.println(num + " is a duck number.");
        }
        else {
            System.out.println(num + " is not a duck number.");
        }
    }
}
