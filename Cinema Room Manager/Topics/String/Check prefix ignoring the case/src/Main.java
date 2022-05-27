import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next().toLowerCase();
        System.out.println(inputString.startsWith("j"));
    }
}