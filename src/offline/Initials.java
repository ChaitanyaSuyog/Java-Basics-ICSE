package src.offline;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine().trim();
        String initials = "";
        char ch = '\u0000';

        char firstInitial = name.charAt(0);
        initials += firstInitial + " ";
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            if (i == name.lastIndexOf(" ")) {
                initials += name.substring(++i);
            }
            else if (Character.isWhitespace(ch)) {
                initials += name.charAt(++i) + " ";
            }
        }
        System.out.println("Your initials are: " + initials);
    }
}
