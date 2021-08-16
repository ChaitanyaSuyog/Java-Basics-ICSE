//Program 23 - WAP to print the tables for the given number from the user (till 10).

package src;

import java.util.Scanner;

public class TablesTillTen23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to get the table: ");
        int n = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            String print = n + " * " + i;
            int product = n * i;
            System.out.println(print + " = " + product);
        }
    }
}
