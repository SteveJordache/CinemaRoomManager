import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] workingArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            workingArray[i] = scanner.nextInt();
        }
        int firstElement = scanner.nextInt();
        int secondElement = scanner.nextInt();
        boolean neverClosed = true;
        for (int i = arrayLength - 1; i > 0; i--) {
            if (workingArray[i] == firstElement) {
                if (workingArray[i - 1] == secondElement) {
                    neverClosed = false;
                    break;
                }
            } else if (workingArray[i] == secondElement && workingArray[i - 1] == firstElement) {
                neverClosed = false;
                break;
            }
        }
        System.out.println(neverClosed);
    }

}