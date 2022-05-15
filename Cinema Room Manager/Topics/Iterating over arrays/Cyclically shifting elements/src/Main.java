import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] workingArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            workingArray[i] = scanner.nextInt();
        }
        int[] resultArray = new int[arrayLength];
        for (int i = arrayLength - 1; i > 0; i--) {
            resultArray[i] = workingArray[i - 1];
        }
        resultArray[0] = workingArray[arrayLength - 1];
        for (int var : resultArray) {
            System.out.print(var + " ");
        }
    }
}