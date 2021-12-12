//Program 39- WAP to print numbers 1, 2 using a for loop and break statement.

package src.online;

public class JumpBreak38 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
