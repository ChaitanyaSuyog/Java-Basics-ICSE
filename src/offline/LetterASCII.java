package src.offline;

import java.util.Scanner;

public class LetterASCII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word of your choice:");
        String word = scan.next();

        char ch = '\u0000';
        int ascii = 0;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            ascii = ch;
            System.out.println(ch + " - " + ascii);
        }
    }
}
