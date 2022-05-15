import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue = scanner.nextInt();
        int endValue = scanner.nextInt();
        long product = 1L;
        for (int i = startValue; i < endValue; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
