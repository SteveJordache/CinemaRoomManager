import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue = scanner.nextInt();
        int endValue = scanner.nextInt();
        int divisibleNumber = scanner.nextInt();
        int divisibleNumbers = 0;
        for (int i = startValue; i <= endValue; i++) {
            if (i % divisibleNumber == 0) {
                divisibleNumbers++;
            }
        }
        System.out.println(divisibleNumbers);
    }
}