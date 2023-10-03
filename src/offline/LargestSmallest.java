package src.offline;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 10 integers: ");
        int[] x = new int[10];

        for (int i = 0; i < 10; i++) {
            x[i] = scan.nextInt();
        }
        int large = x[0];
        for (int i = 0; i < 10; i++) {
            if (x[i] > large) {
                large = x[i];
            }
        }
        int small = large;
        for (int i = 0; i < 10; i++) {
            if (x[i] < small) {
                small = x[i];
            }
        }

        System.out.println("Largest no. = " + large);
        System.out.println("Smallest no. = " + small);
    }
}
