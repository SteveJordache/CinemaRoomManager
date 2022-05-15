import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            number /= 10 ;
            if (number < 10) {
                break;
            }
        }
        System.out.println(number);
    }
}