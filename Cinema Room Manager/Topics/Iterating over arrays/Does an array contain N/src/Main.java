import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] workingArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            workingArray[i] = scanner.nextInt();
        }
        int toCheck = scanner.nextInt();
        boolean found = false;
        for (int var : workingArray) {
            if (var == toCheck) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}