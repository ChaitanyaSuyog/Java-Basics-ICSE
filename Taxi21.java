import java.util.Scanner;

public class Taxi21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the taxi number: ");
        String taxiNo = scan.nextLine();

        System.out.println("Enter the distance covered: ");
        double s = scan.nextDouble();

        double amt = 0d;
        double rate = 0d;

        if (s <= 5) {
            rate = 100d;
            amt = s * rate;
        }
        else if (s > 5 && s <= 10) {
            rate = 10;
            amt = 100 + (s - 5) * 10;
        }
        else if (s > 15 && s <= 20) {
            rate = 8;
            amt = 100 + (10 * 10) + (s - 15) * 8;
        }
        else if (s > 25) {
            rate = 5;
            amt = 100 + (10 * 10) + (20 * 8) + (s -25) * 5;
        }
        else {
            System.out.println("Invalid input.");
        }
        System.out.println("Taxi No.: " + taxiNo + "\nDistance Covered: " + s + "\nAmount: " + amt);
    }
}

