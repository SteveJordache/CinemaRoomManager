import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int[] workingArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            workingArray[i] = scanner.nextInt();
        }
        for (int var : workingArray) {
            max = var > max ? var : max;
        }
        for (int i = 0; i < arrayLength; i++) {
            if (workingArray[i] == max) {
                System.out.println(i);
                break;
            }
        }
    }
}