package src.offline;

import java.util.Scanner;

public class SquaRecTriangle {
    void square(int n, char ch) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    void rectangle(int x, int y) {
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("$" + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    void triangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@" + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side and character for the square: ");
        int n = scan.nextInt();
        char c = scan.next().charAt(0);
        System.out.println("Enter the length and breadth for the rectangle: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        SquaRecTriangle t = new SquaRecTriangle();
        t.square(n, c);
        t.rectangle(x, y);
        t.triangle();
    }
}

