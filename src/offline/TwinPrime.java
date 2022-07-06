//WAP to check if a given number is twin prime or no.

package src.offline;

import java.util.Scanner;

public class TwinPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a no. to see if it's a twin prime: ");
        int n = scan.nextInt();
        int np2 = n + 2;
        int nm2 = n - 2;

        int c1 = checkPrime(n);
        int c2 = checkPrime(np2);
        int c3 = checkPrime(nm2);

        if (c1 == 2 && c2 == 2) {
            System.out.println(n + " is a twin prime with " + np2);
        }
        else if (c1 == 2 && c3 == 2) {
            System.out.println(n + " is a twin prime with " + nm2);
        }
        else {
            System.out.println(n + " is not a twin prime.");
        }

    }
    public static int checkPrime(int number) {
        int c = 0;
        for (int x = 1; x <= number; x++) {
            if (number % x == 0) {
                c += 1;
            }
        }
        return c;
    }
}
