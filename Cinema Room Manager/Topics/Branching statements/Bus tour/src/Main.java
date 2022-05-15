import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int nrOfBridges = scanner.nextInt();
        String returnString;
        int counter = 0;
        int returnCounter = 0;
        boolean isFeasible = true;
        while (nrOfBridges != 0) {
            int bridgeHeight = scanner.nextInt();
            counter++;
            if (busHeight >= bridgeHeight && isFeasible) {
                isFeasible = false;
                returnCounter = counter;
            }
            nrOfBridges--;
        }
        returnString = isFeasible ? "Will not crash" : "Will crash on bridge " + returnCounter;
        System.out.println(returnString);

    }
}