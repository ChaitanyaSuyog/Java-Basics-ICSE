// Program 9- WAP to calculate and display the simple interest and amount given the principal, amount, rate per annum and time (in years).

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal (Rs.), rate per annum, and time (in years): ");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        double si = 0.0d;
        double amt = 0.0d;
        si = (p * t * r) / 100;
        amt = p + si;
        System.out.println("The S.I = Rs." + si + ", the amount = Rs." + amt);
    }
}
