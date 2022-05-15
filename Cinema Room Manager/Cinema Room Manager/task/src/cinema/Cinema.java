package cinema;
import java.util.Scanner;


public class Cinema {

    public static void main(String[] args) {
        /*final int startVal = 1;
        final int nrOfSeats = 8;
        final int nrOfRows = 7;
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = startVal; i <= nrOfSeats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = startVal; i <= nrOfRows; i++) {
            System.out.print(i + " ");
            for (int j = startVal; j <= nrOfSeats; j++) {
                System.out.print("S ");
            }
            System.out.println();*/
        //*******************************************************
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int  numberOfSeats = scanner.nextInt();
        int totalNumberOfSeats = numberOfSeats * numberOfRows;
        if (totalNumberOfSeats < 60) {
            System.out.println("Total income:\n$" + totalNumberOfSeats * 10);
        } else {
            int fistRows = numberOfRows / 2;
            int lastRows = numberOfRows - fistRows;
            System.out.println("Total income:\n$" + (fistRows * numberOfSeats * 10 + lastRows *numberOfSeats * 8));
        }
    }
}