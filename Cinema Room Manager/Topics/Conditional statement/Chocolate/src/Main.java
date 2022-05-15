import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int kValue = scanner.nextInt();
        int totalArea = length * width;
        if (totalArea % kValue != 0 && length * width < kValue) {
            System.out.println("NO");
        } else if (kValue * length % totalArea == 0 || kValue * width % totalArea == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}