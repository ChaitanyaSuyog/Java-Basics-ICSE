package src.offline;

import java.util.Scanner;

public class SumArray {
    public static int[] sumProd(int[] x) {
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < 10; i++) {
            sum += x[i];
            prod *= x[i];
        }
        int[] sumProd = {sum, prod};
        return sumProd;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 10 integers: ");
        int[] x = new int[10];

        for (int i = 0; i < 10; i++) {
            x[i] = scan.nextInt();
        }

        int[] result = sumProd(x);
        System.out.println("Sum = " + result[0]);
        System.out.println("Product = " + result[1]);
    }
}
