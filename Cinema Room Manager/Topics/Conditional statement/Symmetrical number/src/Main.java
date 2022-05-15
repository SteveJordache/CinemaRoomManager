import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int inputVal = scanner.nextInt();
        int valToCompare = 0;
        for (int i = 0; i < 2; i++) {
            int buffer = inputVal % 10;
            valToCompare = valToCompare * 10 + buffer;
            inputVal /= 10;
        }
        if (valToCompare == inputVal) {
            System.out.println("1");
        } else {
            System.out.println("55");
        }

    }
}