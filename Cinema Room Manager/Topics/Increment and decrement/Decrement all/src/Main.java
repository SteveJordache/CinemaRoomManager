import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();
        int val4 = scanner.nextInt();
        System.out.println(--val1 + " " + --val2 + " " + --val3 + " " + --val4);
    }
}