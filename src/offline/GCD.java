package src.offline;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int t = 0;
        while (a % b != 0) {
            t = a % b;
            a = b;
            b = t;
        }
        System.out.println("GCD = " + b);
    }
}
