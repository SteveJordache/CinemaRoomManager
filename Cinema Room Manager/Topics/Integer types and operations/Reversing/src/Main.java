import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int numerToReverse = scanner.nextInt();
        int buffer;
        int counter = 0;
        int result = 0;
        buffer = numerToReverse;
        while (buffer > 0) {
            counter++;
            buffer /= 10;
        }
        for (int i = 0; i < counter; i++) {
            buffer = numerToReverse % 10;
            result = result * 10 + buffer;
            numerToReverse /= 10;
        }
        System.out.println(result);
    }
}