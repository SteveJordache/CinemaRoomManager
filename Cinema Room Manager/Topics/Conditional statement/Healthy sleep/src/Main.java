import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aHours = scanner.nextInt();
        int bHours = scanner.nextInt();
        int cHours = scanner.nextInt();
        if (cHours <  aHours) {
            System.out.println("Deficiency");
        } else if (cHours > bHours) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}