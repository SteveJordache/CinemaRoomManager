import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int inputVal = scanner.nextInt();
        System.out.println(inputVal < 10 && inputVal > 0);
    }
}