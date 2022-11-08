package src.offline;

import java.util.Scanner;

public class StringPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to generate the pattern:");
        String word = scan.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(0, i+1));
        }
    }
}
