// Program 10- WAP to find the number of years, months and days, given the total number of days.

package com.chaitanya;

import java.util.Scanner;

public class YearConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days = sc.nextInt();
        int y = 0;
        int m = 0;
        int d = 0;
        y = days / 365;
        m = (days % 365) / 30;
        d = (days % 30) % 30;
        System.out.println("No. of years: " + y + ", no. of months: " + m + ", no of days: " + d);
    }
}
