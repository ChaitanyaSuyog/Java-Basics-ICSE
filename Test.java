import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of x and the number of terms:");
        double x = scan.nextDouble();
        int n = scan.nextInt();
        double dr = 2d;
        double sum = 0d;
        for (int i = 1; i <= n; i++) {
            sum = sum + (x/dr);
            dr += 2;
        }
        System.out.println(sum);
    }
}
