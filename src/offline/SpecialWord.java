package src.offline;

import java.util.Scanner;

public class SpecialWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        if(word.toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length() - 1)) {
            System.out.println(word + " is a special word.");
        }
    }
}
