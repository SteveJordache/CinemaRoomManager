package cinema;

import java.util.Scanner;
import java.util.Arrays;

public class Cinema {
    static String [][] seating;
    static Scanner scanner = new Scanner(System.in);
    static boolean bigRoom;
    static int nrOfRows;
    static int nrOfSeats;

    public static void printTheSeats(int nrOfRows, int nrOfSeats) {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= nrOfSeats; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < nrOfRows; i++){
            System.out.print(i + 1);
            for(int j = 0; j < nrOfSeats; j++){
                System.out.print(" " + seating[i][j]);
            }
            System.out.println();
        }
    }


    public static void buyTicket() {
        System.out.println("Enter a row number:");
        int rowNumber = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatNumber = scanner.nextInt();
        if (bigRoom && rowNumber > nrOfRows / 2 ) {
            System.out.println("Ticket price: $8");
        } else {
            System.out.println("Ticket price: $10");
        }
        seating[rowNumber - 1][seatNumber -1] = "B";

    }



    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        nrOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        nrOfSeats = scanner.nextInt();
        bigRoom = nrOfRows * nrOfSeats >= 60 ? true : false;
        seating = new String[nrOfRows][nrOfSeats];
        for (int i = 0; i < nrOfRows; i++) {
            for (int j = 0; j < nrOfSeats; j++){
                seating[i][j] = "S";
            }
        }
        int flag = Integer.MAX_VALUE;
        while (flag != 0) {
            System.out.println();
            System.out.println("1. Show the seats\n2. Buy a ticket\n0. Exit");
            flag = scanner.nextInt();
            switch (flag) {
                case 1:
                    printTheSeats(nrOfRows, nrOfSeats);
                    break;
                case 2:
                    buyTicket();
                    break;
                case 0:
                    break;
                default:
                    continue;
            }


        }
    }
}