import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] inputArray = new int[arrayLength];
        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            inputArray[i] = scanner.nextInt();
            sum += inputArray[i];
        }
        System.out.println(sum);
        // System.out.println(Arrays.toString(inputArray));
    }
}