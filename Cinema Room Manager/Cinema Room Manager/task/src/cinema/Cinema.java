package cinema;
import java.util.Scanner;

public class Cinema {
    static String [][] seating;
    static Scanner scanner = new Scanner(System.in);
    static boolean bigRoom;
    static int nrOfRows;
    static int nrOfSeats;
    static long income = 0;
    static double occupancyPercentage = 0;
    static int numberOfPurchasedTickets = 0;
    static int totalCapacity = 0;
    static int potentialIncome;
    static int rowNumber;
    static int seatNumber;


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
                System.out.println();
        System.out.println("Enter a row number:");
        rowNumber = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        seatNumber = scanner.nextInt();
        while (true) {
            if (rowNumber < 1 || seatNumber < 1 || rowNumber > nrOfRows || seatNumber > nrOfSeats) {
                System.out.println("Wrong input!");
                buyTicket();
            } else {
                if ("S".equals(seating[rowNumber - 1][seatNumber -1])){
                    if (bigRoom && rowNumber > nrOfRows / 2 ) {
                        System.out.println("Ticket price: $8");
                        income +=  8;
                    } else {
                        System.out.println("Ticket price: $10");
                        income += 10;
                    }
                    seating[rowNumber - 1][seatNumber -1] = "B";
                    numberOfPurchasedTickets += 1 ;
                    occupancyPercentage = (double) (numberOfPurchasedTickets * 100) / totalCapacity;
                    break;
                } else {
                    System.out.println("That ticket has already been purchased!");
                    buyTicket();
                }
            }
        }

    }
    public static void statistics() {
        potentialIncome = 0;
        System.out.println();
        System.out.printf("Number of purchased tickets: %d%n",numberOfPurchasedTickets);
        String tempString = String.format("Percentage: %.2f", occupancyPercentage);
        System.out.println(tempString + "%");
        System.out.printf("Current income: $%d%n",income);
        if (!bigRoom) {
            potentialIncome = totalCapacity * 10;
        } else {
            for (int i = 1; i <= nrOfRows; i++) {
                if (i <= nrOfRows/2) {
                    potentialIncome += nrOfSeats * 10;
                } else {
                    potentialIncome += nrOfSeats * 8;
                }
            }
        }

        System.out.printf("Total income: $%d%n", potentialIncome);
    }



    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        nrOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        nrOfSeats = scanner.nextInt();
        totalCapacity = nrOfRows * nrOfSeats;
        bigRoom = totalCapacity >= 60;
        seating = new String[nrOfRows][nrOfSeats];
        for (int i = 0; i < nrOfRows; i++) {
            for (int j = 0; j < nrOfSeats; j++){
                seating[i][j] = "S";
            }
        }
        int flag = Integer.MAX_VALUE;
        while (flag != 0) {
            System.out.println();
            System.out.println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            flag = scanner.nextInt();
            switch (flag) {
                case 1:
                    printTheSeats(nrOfRows, nrOfSeats);
                    break;
                case 2:
                    buyTicket();
                    break;
                case 3:
                    statistics();
                    break;
                case 0:
                    break;
                default:
            }


        }
    }
}