import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNUmber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        System.out.println(firstNumber != secondNUmber && firstNumber != thirdNumber && secondNUmber != thirdNumber);
    }
}