/* Question - Define a class to declare a character array of size 20, accept the characters into the array and
   display the characters with highest and lowest ASCII value.
 */

package src.preboard23;

import java.util.Scanner;

public class LowHighASCII {
    public static void main(String[] args) {
        char[] ch = new char[20];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 20 characters: ");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = scan.next().charAt(0);
        }

        int low = ch[0], high = ch[0];
        for (int j = 0; j < ch.length; j++) {
            if (ch[j] < low) {
                low = ch[j];
            }
            if (ch[j] > high) {
                high = ch[j];
            }
        }

        System.out.println("Character with: \nLowest ASCII value -> " + low + " - " + (char)low + "\nHighest ASCII value -> " + high +
                " - " + (char)high);
    }
}
