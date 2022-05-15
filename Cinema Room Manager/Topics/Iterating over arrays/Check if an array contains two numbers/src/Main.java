import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] workingArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            workingArray[i] = scanner.nextInt();
        }
        int firstCheck = scanner.nextInt();
        int secondCheck = scanner.nextInt();
        boolean verify = false;
        for (int i = 1; i < arrayLength - 1; i++) {
            if (workingArray[i] == firstCheck) {
                if (workingArray[i - 1] == secondCheck || workingArray[i + 1] == secondCheck) {
                    verify = true;
                    break;
                }
            } else if (workingArray[i] == secondCheck && (workingArray[i - 1] == firstCheck ||
                    workingArray[i + 1] == firstCheck)) {
                verify = true;
                break;
            }
        }
        System.out.println(verify);
    }
}