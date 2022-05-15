import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        boolean stillRunning = true;
        while (stillRunning) {
            int valueInput = scanner.nextInt();
            max = max > valueInput ? max : valueInput;
            stillRunning = valueInput != 0 ? true : false;
        }
        System.out.println(max);
    }
}