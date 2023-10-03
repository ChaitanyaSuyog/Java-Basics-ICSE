package src.offline;

public class TechNo {
    public static void checkNo(int n) {
        int oN = n;
        int half1 = n % 100;
        int half2 = n / 100;

        if (Math.pow(half1 + half2, 2) == oN) {
            System.out.println(oN);
        }
    }

    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            checkNo(i);
        }
        System.out.println("The above no.s are all 4-digit tech no.s");
    }
}
