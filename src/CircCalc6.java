// Program 6- WAP to find the area and circumference of a circle.

package src;

import java.util.Scanner;

public class CircCalc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r = sc.nextInt();
        double ac = 3.14 * r * r;
        double cc = 3.14 * 2 * r;
        System.out.println("The area = " + ac + ", the circumference = " + cc);
    }
}
