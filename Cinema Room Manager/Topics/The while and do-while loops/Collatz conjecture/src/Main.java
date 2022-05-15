import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCollatz = scanner.nextInt();
        while (numberCollatz != 1) {
            System.out.print(numberCollatz + " ");
            if (numberCollatz % 2 == 0) {
                numberCollatz /= 2;
            } else {
                numberCollatz = numberCollatz * 3 + 1;
            }
        }
        System.out.println(numberCollatz);
    }
}
