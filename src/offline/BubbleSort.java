package src.offline;

import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 elements:");
        int[] x = new int[5];

        for (int i = 0; i < x.length; i++) {
            x[i] = scan.nextInt();
        }

        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(x));
        
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - i - 1; j++) {
                if (x[j] > x[j+1]) {
                    int t = x[j];
                    x[j] = x[j+1];
                    x[j+1] = t;
                }
            }
        }

        System.out.println("Sorted array: ");
        System.out.print("[");
        for (int i = 0; i < x.length; i++) {            
            System.out.print(x[i] + ", ");            
        }
        System.out.print("\b\b]");
    }
}