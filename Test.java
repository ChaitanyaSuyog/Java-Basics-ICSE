import java.util.Scanner;

class PrimeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check whether it is prime or not: ");
        int number = scan.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("The number is prime.");
        }
        else {
            System.out.println("The number is not prime.");
        }
    }
}
