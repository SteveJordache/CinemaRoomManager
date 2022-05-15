import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] inputArray = new int[arraySize];
        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int checkNumber = scanner.nextInt();
        for (int value : inputArray) {
            if (value > checkNumber) {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}