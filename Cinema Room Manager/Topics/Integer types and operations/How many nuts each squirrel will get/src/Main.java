import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrOfSquirrels = scanner.nextInt();
        int nrOfNuts = scanner.nextInt();
        System.out.println(nrOfNuts / nrOfSquirrels);
    }
}