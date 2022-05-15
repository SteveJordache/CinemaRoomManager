import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; n > 0; i++) {
            for (int j = 1; j <= i && n > 0; n--, j++) {
                System.out.print(i + " ");
            }
        }
    }
}