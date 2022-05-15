import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int numberOfDigits = 0;
        int sum = 0;
        int buffer = inputNumber;
        while (buffer > 0) {
            numberOfDigits++;
            buffer /= 10;
        }
        for (int i = 0; i < numberOfDigits; i++) {
            sum += inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println(sum);
    }
}