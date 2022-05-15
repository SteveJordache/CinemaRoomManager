import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueToCheck = scanner.nextInt();
        if (valueToCheck > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}