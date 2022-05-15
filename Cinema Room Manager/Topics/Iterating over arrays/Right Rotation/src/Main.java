import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] origString = inputString.split(" ");
        int offset = scanner.nextInt();
        offset %= origString.length;
        String[] resultSting = new String[origString.length];
        int maxIndex = origString.length - 1;
        for (int i = 0; i <= maxIndex; i++) {
            int newIndex = i + offset;
            if (newIndex > maxIndex) {
                newIndex -= origString.length;
            }
            resultSting[newIndex] = origString[i];
        }
        for (String var : resultSting) {
            System.out.print(var + " ");

        }
    }
}