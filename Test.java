public class Test {
    public static void main(String[] args) {
        for (int j = 15; j > 1; j -= 2) {
            if (j > 10) {
                System.out.println(j++);
            }
            else {
                System.out.println(--j);
            }
        }
    }
}
