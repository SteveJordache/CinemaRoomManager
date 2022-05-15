import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] workingArray =  new int[arraySize];
        int matching = 0;
        for (int i = 0; i < arraySize; i++) {
            workingArray[i] = scanner.nextInt();
        }
        for (int i = 1; i < arraySize - 1; i++) {
            if (workingArray[i - 1] + 1 == workingArray[i] && workingArray[i] + 1 == workingArray[i + 1]) {
                matching++;
            }
        }
        System.out.println(matching);
    }
}