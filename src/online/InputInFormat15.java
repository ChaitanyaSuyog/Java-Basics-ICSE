/* Program 15- WAP to input your name, 3 subject marks, class and section. Calculate and display the total and average in the format given:

NAME:
CLASS:
SECTION:

SUBJECT 1   SUBJECT 2   SUBJECT 3
_________   _________   _________

 TOTAL:
 AVERAGE:

 */

package src.online;

import java.util.Scanner;

public class InputInFormat15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name, 3 subject marks, class and section.");

        String name = scan.nextLine();
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int c = scan.nextInt();
        char sec = scan.next().charAt(0);

        int total = s1 + s2 + s3;
        float average = (float) (total / 3);
        System.out.println("NAME: " + name + "\nCLASS: " + c + "\nSECTION: " + sec + "\nSUBJECT 1\tSUBJECT 2\tSUBJECT 3");
        System.out.println("" + s1 + "\t\t\t" + s2 + "\t\t\t" + s3);
        System.out.println("TOTAL: " + total + "\nAVERAGE: " + average);
    }
}
