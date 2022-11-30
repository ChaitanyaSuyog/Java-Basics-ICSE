package src.offline;

import java.util.Scanner;

public class StartsA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence =  " " + scan.nextLine().toUpperCase().trim();

        char ch = '\u0000';
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            ch = sentence.charAt(i);
            if (ch == ' ') {
                if (sentence.charAt(i+1) == 'A') {
                    count++;
                }
            }
        }
        System.out.println("No. of words starting with 'A': " + count);
    }
}
