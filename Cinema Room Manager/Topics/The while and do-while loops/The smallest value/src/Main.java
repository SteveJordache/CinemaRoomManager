import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputNUmber = scanner.nextLong();
        long calculatedFactorial = 1;
        int toNumber = 1;
        while (calculatedFactorial <= inputNUmber) {
            toNumber++;
            calculatedFactorial = calculatedFactorial * toNumber;
        }
        System.out.println(toNumber);

    }
}