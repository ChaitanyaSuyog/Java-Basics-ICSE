/* Question - Write a program to count and display the following using the given methods -
   (i) void count(String s) that counts the number of digits, lowercase and uppercase letters and special characters.
   (ii) void display() that displays the above result.
   Create a main method and call the above methods by creating an object for the class.
 */

package src.preboard23;

import java.util.Scanner;

public class Functions {
    int cDigit = 0, cLow = 0, cUp = 0, cSpecial = 0;
    void count(String s) {
        char ch = '\u0000';
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                cDigit++;
            }
            else if (Character.isLowerCase(ch)) {
                cLow++;
            }
            else if (Character.isUpperCase(ch)) {
                cUp++;
            }
            else {
                cSpecial++;
            }
        }
    }

    void display() {
        System.out.println("No. of digits = " + cDigit);
        System.out.println("No. of lowercase letters = " + cLow);
        System.out.println("No. of uppercase letters = " + cUp);
        System.out.println("No. of special characters = " + cSpecial);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        Functions obj = new Functions();
        obj.count(str);
        obj.display();
    }
}
