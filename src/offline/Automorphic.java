//WAP to accept a number from the user. Check and display if it is an automorphic number.

package src.offline;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is automorphic or not.");
        int n = scan.nextInt();
        int orgN = n;

        int nSqr = n * n;
        int isAutomorphic = 0;

        while (n != 0) {
            if (n % 10 != nSqr % 10) {
                isAutomorphic = 1;
            }
            else {
                isAutomorphic = 0;
            }
            n /= 10;
            nSqr /= 10;
        }

        switch (isAutomorphic) {
            case 0:
                System.out.println(orgN + " is an automorphic number.");
                break;
            case 1:
                System.out.println(orgN + " is not an automorphic number.");
                break;
        }

    }
}
