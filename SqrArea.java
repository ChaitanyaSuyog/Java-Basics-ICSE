// Program 4- WAP to calculate and print the area of a square by taking the input from the user.

import java.util.*;

public class SqrArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square: ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("The area of the square is = " + area);
    }
}
