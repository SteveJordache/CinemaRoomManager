import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] annualIncome = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            annualIncome[i] = scanner.nextInt();
        }
        int[] taxationPercents = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            taxationPercents[i] = scanner.nextInt();
        }
        double[] payedTaxes = new double[arrayLength];
        double biggestPayer = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (taxationPercents[i] > 0) {
                payedTaxes[i] = (double) annualIncome[i] * taxationPercents[i] / 100;
            } else if (taxationPercents[i] == 0) {
                payedTaxes[i] = 0;
            }
            biggestPayer = payedTaxes[i] > biggestPayer ? payedTaxes[i] : biggestPayer;
        }

        for (int i = 0; i < arrayLength; i++) {
            if (payedTaxes[i] == biggestPayer) {
                System.out.println(i + 1);
                break;
            }
        }

    }
}


