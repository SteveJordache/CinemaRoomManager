import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfButterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean result1 = isWeekend && numberOfButterCups  >= 15 && numberOfButterCups <= 25;
        boolean result2 = !isWeekend && numberOfButterCups >= 10 && numberOfButterCups <= 20;
        System.out.println(result1 || result2);
    }
}