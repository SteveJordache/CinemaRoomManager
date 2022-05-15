import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] workingArray = new int[arraySize];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arraySize; i++) {
            workingArray[i] = scanner.nextInt();
            min = workingArray[i] < min ? workingArray[i] : min;
        }
        System.out.println(min);
    }
}