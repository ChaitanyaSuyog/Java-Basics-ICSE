package src.offline;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringCount {
    public static int spaceCount(String str) {
        char c = '\u0000';
        int sC = 0;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == ' ') {
                sC++;
            }
        }
        return sC;
    }
    public static int letterCount(String str) {
        char c = '\u0000';
        int lC = 0;

        char[] letters = new char[26];
        int letterNo = 97;
        for (int i = 0; i < letters.length; i++, letterNo++) {
            letters[i] = (char) letterNo;
        }

        for (int i = 0; i < str.length(); i++) {
            c = str.toLowerCase().charAt(i);
            for (int j = 0; j < letters.length; j++) {
                if (c == letters[j]) {
                    lC++;
                }
            }
        }
        return lC;
    }
    public static int wordCount(String strDefault) {
        char c = '\u0000';
        int wC = 0;

        String str = strDefault.trim();

        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (i != (str.length() - 1)) {
                if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                    wC++;
                }
            }
            if (i == (str.length() - 1)) {
                if (str.charAt(i) != ' ' || str.charAt(i) == ' ') {
                    wC++;
                }
            }
        }
        return wC;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string of your choice:");
        String str = scan.nextLine();

        int sC = spaceCount(str);
        int lC = letterCount(str);
        int wC = wordCount(str);

        System.out.println("No. of spaces: " + sC + "\nNo. of letters: " + lC + "\nNo. of words: " + wC);
    }
}
