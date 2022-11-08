package src.offline;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String givenStr = scan.nextLine().trim();
        String str = givenStr + " ";

        String individual = "";
        char ch = '\u0000';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == ' ') {
                individual = str.substring(0, i);
                str = str.substring(i+1);
                i = 0;
                for (int j = individual.length() - 1; j >= 0; j--) {
                    System.out.print(individual.charAt(j));
                }
                System.out.print(" ");
            }
        }
    }
}
