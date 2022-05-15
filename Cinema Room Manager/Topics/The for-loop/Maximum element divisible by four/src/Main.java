import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrOfElements = scanner.nextInt();
        int maxDivisible = 0;
        for (int i = 0; i < nrOfElements; i++) {
            int element = scanner.nextInt();
            maxDivisible = element % 4 == 0 && element > maxDivisible ? element : maxDivisible;
        }
        System.out.println(maxDivisible);
    }
}