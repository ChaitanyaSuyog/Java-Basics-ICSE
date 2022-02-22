package src.offline;

import java.util.Scanner;

public class Niven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Niven or not: ");
        int n = scan.nextInt();
        int orgN = n;

        int dig = 0, sum = 0;
        while (n != 0) {
            dig = n % 10;
            sum += dig;
            n /= 10;
        }

        if (orgN % sum == 0) {
            char d = '\u2223';
            System.out.println(orgN + " is a Niven number (" + orgN + " " + d + " " + orgN + ")");
        }
        else {
            char nd = '\u2224';
            System.out.println(orgN + " is not a Niven number (" + orgN + " " + nd + " " + orgN + ")");
        }
    }
}
