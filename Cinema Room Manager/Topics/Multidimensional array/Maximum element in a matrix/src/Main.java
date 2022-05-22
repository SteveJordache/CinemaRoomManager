import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mainArrayLength = scanner.nextInt();
        int elementsInNestedArray = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int firsIndex = -1;
        int secondIndex = -1;
        int[][] workingArray = new int[mainArrayLength][elementsInNestedArray];
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = 0; j < workingArray[i].length; j++) {
                workingArray[i][j] = scanner.nextInt();
            }
        }
        for (int i = workingArray.length - 1; i >= 0; i--) {
            for (int j = workingArray[i].length - 1; j >= 0; j--) {
                // System.out.println(workingArray[i][j]);
                if (workingArray[i][j] >= max) {
                    max = workingArray[i][j];
                    firsIndex = i;
                    secondIndex = j;
                }
            }
        }
        System.out.println(firsIndex + " " + secondIndex);

    }
}