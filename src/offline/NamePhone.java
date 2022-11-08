package src.offline;

import java.util.Scanner;

public class NamePhone {
    public static void main(String[] args) {
        String[] names = new String[10];
        long[] phNo = new long[10];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = scan.nextLine().trim();
        }
        System.out.println("Enter the corresponding phone numbers:");
        for (int i = 0; i < phNo.length; i++) {
            phNo[i] = scan.nextLong();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required name:");
        String name = sc.nextLine().trim();
        long phoneNo = 0L;

        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                phoneNo = phNo[i];
            }
        }

        System.out.println(name + " - " + phoneNo);
    }
}
