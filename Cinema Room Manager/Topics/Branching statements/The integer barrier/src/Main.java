import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        while (true) {
            int inputNumber = scanner.nextInt();
            if (inputNumber != 0 && totalSum < 1000) {
                totalSum += inputNumber;
            } else {
                break;
            }
        }
        if (totalSum >= 1000) {
            System.out.println(totalSum - 1000);
        } else {
            System.out.println(totalSum);
        }
    }
}