//0 CLUE

package src.offline;

import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();
        System.out.println("Enter the word:");
        String word = scan.next().trim();

        int count=0;

        //individual = str.substring(0, i);
        //str = str.substring(i+1);

        for(int i = 0; i <= sentence.length(); i++) {
            if (i == sentence.indexOf(word)) {
                count++;
                sentence = sentence.substring(word.length());
                i = 0;
            }
        }
        System.out.println(word + " - " + count + " occurences");
    }
}


