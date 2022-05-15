import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < 2; i++) {
            result = number % 10;
            number /= 10;
        }
        System.out.println(result);
    }
}