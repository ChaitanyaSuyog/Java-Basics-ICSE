// Program 17 - WAP to check if the given number input is positive, negative or equal to 0.

package src.online;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElseIfElse17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        float a = scan.nextFloat();

        if(a > 0) {
            System.out.println(a + " is a positive number.");
        }
        else if (a < 0) {
            System.out.println(a + " is a negative number.");
        }
        else if (a == 0) {
            System.out.println(a + " is 0.");
        }
        else {
            throw new InputMismatchException("Invalid input.");
        }
    }

}
