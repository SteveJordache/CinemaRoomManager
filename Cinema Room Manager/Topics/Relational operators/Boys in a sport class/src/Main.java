import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstBoy = scanner.nextInt();
        int secondBoy = scanner.nextInt();
        int thirdBoy = scanner.nextInt();
        System.out.println(firstBoy >= secondBoy && secondBoy >= thirdBoy ||
                firstBoy <= secondBoy && secondBoy <= thirdBoy);
    }
}