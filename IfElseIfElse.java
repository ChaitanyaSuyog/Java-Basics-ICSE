// Program 16 - WAP to check if the given number input is positive, negative or equal to 0.

import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
            System.out.println("Invalid.");
        }
    }

}
