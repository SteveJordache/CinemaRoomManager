import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int sequenceLenght = 0;
        while (inputValue != 0) {
            sequenceLenght++;
            inputValue = scanner.nextInt();
        }
        System.out.println(sequenceLenght);
    }
}