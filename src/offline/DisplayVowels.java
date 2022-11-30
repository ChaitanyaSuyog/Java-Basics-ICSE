package src.offline;

import java.util.Scanner;

public class DisplayVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine().toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        char ch = '\u0000';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (ch == vowels[j]) {
                    System.out.print(ch + " ");
                }
            }
        }
    }
}
