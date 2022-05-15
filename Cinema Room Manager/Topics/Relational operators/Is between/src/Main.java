import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();
        int thirdValue = scanner.nextInt();
        int highestValue;
        int lowestValue;
        if (secondValue >= thirdValue) {
            highestValue = secondValue;
            lowestValue = thirdValue;
        } else {
            highestValue = thirdValue;
            lowestValue = secondValue;
        }
        System.out.println(firstValue <= highestValue && firstValue >= lowestValue);
    }
}