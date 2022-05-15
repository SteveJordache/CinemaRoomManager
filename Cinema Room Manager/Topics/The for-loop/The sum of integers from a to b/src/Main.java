import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue = scanner.nextInt();
        int endValue = scanner.nextInt();
        int sum = 0;
        for (int i = startValue; i <= endValue; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}