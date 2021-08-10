// Program 11- WAP to calculate voltage using V = IR.

import java.util.Scanner;

public class Voltage11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current and resistance: ");
        int c = sc.nextInt();
        int r = sc.nextInt();
        double v = c * r;
        System.out.println("Voltage = " + v);
    }
}
