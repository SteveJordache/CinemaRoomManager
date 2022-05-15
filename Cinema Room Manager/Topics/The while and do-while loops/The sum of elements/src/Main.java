import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int inputValue = scanner.nextInt();
            if (inputValue != 0) {
                sum += inputValue;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}