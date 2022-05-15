import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        int start = 1;
        while (start * start <= inputValue) {
            System.out.println(start * start);
            start++;
        }
    }
}