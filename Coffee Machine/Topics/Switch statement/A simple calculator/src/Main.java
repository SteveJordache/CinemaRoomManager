import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNumber = scanner.nextLong();
        String operation = scanner.next();
        long secondNumber = scanner.nextLong();
        // System.out.println(firstNumber + " " + operation + " " + secondNumber);
        switch (operation) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

    }
}