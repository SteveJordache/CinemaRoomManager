import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] workArray = new int[arrayLength];
        for (int i = 0; i < workArray.length; i++) {
            workArray[i] = scanner.nextInt();
        }
        boolean sorted = true;
        for (int i = 1; i < workArray.length; i++) {
            if (workArray[i - 1] > workArray[i]) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }
}