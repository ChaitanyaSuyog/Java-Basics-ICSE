import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range (lower and higher numbers): ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        while (num1 < num2) {
            num1++;
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
        }
    }
}
