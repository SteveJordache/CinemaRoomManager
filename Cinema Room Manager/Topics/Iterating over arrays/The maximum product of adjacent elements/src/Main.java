import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] workingArray =  new int[arrayLength];
        int max = 0;
        for (int i = 0; i < arrayLength; i++) {
            workingArray[i] = scanner.nextInt();
        }
        for (int i = arrayLength - 1; i > 0; i--) {
            int tempMax = workingArray[i] * workingArray[i - 1];
            max = tempMax > max ? tempMax : max;
        }
        System.out.println(max);
    }
}