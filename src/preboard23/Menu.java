/* Question - Write a menu-driven program for the following:
   For an incorrect option, an appropriate error message must be displayed.
   (i) Input a real number (float). Split the integer and fractional part and print them.
   For example,
   Input: 12.8
   Output: Integer part = 12, Fractional part = 0.8

   (ii) Define a class and store the given city names in a single dimensional array. Sort these names in alphabetical
   order using bubble sort technique.
   Input: Mysore, Delhi, Bengaluru, Kolkata, Mumbai, Ajmer
 */

package src.preboard23;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 to get the parts of a float, or 2 to bubble sort an array of cities:");
        int sw = scan.nextInt();

        switch (sw) {
            case 1:
                System.out.println("Enter a float:");
                float f = scan.nextFloat();

                float fFloor = (float) Math.floor(f);
                float fFractional = f - fFloor;
                // due to how float storage works, the system may round to weird answers, but the concept IS CORRECT
                System.out.println("Integer part = " + (int) fFloor + ", Fractional part = " + fFractional);
                break;

            case 2:
                String[] arr = {"Mysore", "Delhi", "Bengaluru", "Kolkata", "Mumbai", "Ajmer"};
                String t = "";
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length - i - 1; j++) {
                        if (arr[j].compareTo(arr[j + 1]) > 0) {
                            t = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = t;
                        }
                    }

                }
                System.out.println("Sorted array:");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i] + ", ");
                }
                System.out.println("\b\b");
                break;
        }

    }
}
