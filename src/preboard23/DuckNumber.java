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
        //If input number with 0 in the beginning is given, it is automatically ignored in the int data type
        int num = scan.nextInt();

        int original = num;
        while (num != 0) {
            if (num % 10 == 0) {
                System.out.println(original + " is a duck number.");
                System.exit(0);
            }
            num /= 10;
        }
        System.out.println(original + " is not a duck number.");
    }
}
