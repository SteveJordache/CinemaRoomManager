package tictactoe;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String symbolString = scanner.nextLine();
        System.out.println("---------");
        for (int j =0; j < 9; j += 3) {
            char poz1 = symbolString.charAt(j);
            char poz2 = symbolString.charAt(j+1);
            char poz3 = symbolString.charAt(j+2);
            System.out.printf("| %s %s %s |%n", poz1, poz2, poz3);
        }
        System.out.println("---------");
    }
}
