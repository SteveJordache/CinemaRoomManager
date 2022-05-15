import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int max = 0;
        int loops = 0;
        while (loops < numberOfElements) {
            loops++;
            int inputNUmber = scanner.nextInt();
            max = inputNUmber % 4 != 0 ? max : inputNUmber > max ? inputNUmber : max;
        }
        System.out.println(max);
    }
}