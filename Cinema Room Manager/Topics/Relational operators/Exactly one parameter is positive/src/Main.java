import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        boolean check1 = thirdNumber <= 0 && secondNumber <= 0 && firstNumber > 0;
        boolean check2 = thirdNumber <= 0 && firstNumber <= 0 && secondNumber > 0;
        boolean check3 = firstNumber <= 0 && secondNumber <= 0  && thirdNumber > 0;
        boolean solution = check1 || check2 || check3;
        System.out.println(solution);
    }
}