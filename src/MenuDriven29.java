/* Program 29 - Write a menu - driven program to:
1. Check if given input is a vowel or consonant
2. To generate the given series 2, 5, 10, 17... upto n numbers.
 */

package src;

import java.util.Scanner;

public class MenuDriven29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press '1' to check for vowel or consonant, '2' for printing series.");
        int menu = scan.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Enter the character: ");
                char l = scan.nextLine().charAt(0);

                if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' || l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U') {
                    System.out.println(l + " is a vowel.");
                }
                else {
                    System.out.println(l + " is a consonant.");
                }
                break;
            case 2:
                System.out.println("Enter the number of terms: ");
                int n = scan.nextInt();

                for (int i = 1; i <= n; i++) {
                    System.out.println(((i * i) + 1) + ", ");
                }
                break;
            default:
                System.out.print("Invalid input.");
        }
    }
}
