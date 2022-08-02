package src.offline;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 10 integers: ");
        int[] x = new int[10];

        for (int i = 0; i < 10; i++) {
            x[i] = scan.nextInt();
        }

        int[] even = new int[10];
        int[] odd = new int[10];

        for (int i = 0, j = 0, k = 0; i < 10; i++) {
            if (x[i] % 2 == 0) {
                even[j] = x[i];
                j++;
            }
            else {
                odd[k] = x[i];
                k++;
            }
        }

        System.out.println("Sum of even numbers = " + sum(even));
        System.out.println("Sum of odd numbers = " + sum(odd));
    }
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += array[i];
        }
        return sum;
    }
}
