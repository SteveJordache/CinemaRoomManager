import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fistNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        boolean isAMatch = fistNumber + secondNumber == 20 || fistNumber + thirdNumber == 20
                || secondNumber + thirdNumber == 20;
        System.out.println(isAMatch);
    }
}