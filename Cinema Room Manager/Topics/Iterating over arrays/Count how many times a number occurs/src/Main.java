import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] workingArray = new int[arrayLength];
        for (int j = 0; j < arrayLength; j++) {
            workingArray[j] = scanner.nextInt();
        }
        int repeatableNumber = scanner.nextInt();
        int counterRepeats = 0;
        for (int var: workingArray) {
            if (var == repeatableNumber) {
                counterRepeats++;
            }
        }
        System.out.println(counterRepeats);
    }
}