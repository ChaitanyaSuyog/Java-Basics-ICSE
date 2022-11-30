package src.offline;

import java.util.Scanner;

public class ReverseCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = scan.nextLine();

        char ch = '\u0000';
        String finalStr = "";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                finalStr += Character.toLowerCase(ch);
            }
            else {
                finalStr += Character.toUpperCase(ch);
            }
        }
        System.out.println(finalStr);
    }
}
