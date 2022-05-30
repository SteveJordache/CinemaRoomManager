package tictactoe;
import java.util.Scanner;

public class Main {
    public static char[][] gameBoard = new char[3][3];
    public static int totalX = 0;
    public static int totalO = 0;
    public static boolean isPossible;
    public static int counter = 0;

    public static void checkGame(char[][] gameBoard) {
        char winningParty = 0;
        isPossible = totalX - totalO >= -1 && totalX - totalO <= 1;
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][0] == gameBoard[i][2]) {
                winningParty = gameBoard[i][0];
                counter++;
            }
        }
        for (int j = 0; j < gameBoard.length; j++) {
            if (gameBoard[0][j] == gameBoard[1][j] && gameBoard[0][j] == gameBoard[2][j]) {
                winningParty = gameBoard[0][j];
                counter++;
            }
        }
        if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2]) {
            winningParty = gameBoard[0][0];
            counter++;
        }
        if (gameBoard[0][2] == gameBoard[1][1] && gameBoard[0][2] == gameBoard[2][0]) {
            winningParty = gameBoard[0][2];
            counter++;
        }
        if (isPossible && counter == 0 && totalX + totalO < 9) {
            System.out.println("Game not finished");
        } else if (isPossible && totalO + totalX == 9 && counter == 0) {
            System.out.println("Draw");
        } else if (isPossible && counter == 1 ) {
            System.out.printf("%s wins", winningParty);
        }
        else if (!isPossible || counter > 1) {
            System.out.println("Impossible");

        }
    }

    public static void printBoard(){
        System.out.println("---------");
        for ( int t =0; t <gameBoard.length; t++) {
            System.out.print("| ");
            for( int z =0; z <gameBoard[t].length; z++) {
                System.out.print(gameBoard[t][z] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("---------");
    }

    public static void enterCoordinates() {
        Scanner scanner = new Scanner (System.in);
        int[] finalArray = new int[2];
        while (true) {
            int counter = 0;
            boolean flag = true;
            System.out.print ("Enter the coordinates: ");
            for (int j = 0; j < 2; j++) {
                if (!flag) {
                    break;
                }
                String inputString = scanner.next();
                switch (inputString) {
                    case "1":
                        finalArray[j] = 1;
                        counter++;
                        break;
                    case "2":
                        finalArray[j] = 2;
                        counter++;
                        break;
                    case "3":
                        finalArray[j] = 3;
                        counter++;
                        break;
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                    case "0":
                        System.out.println ("Coordinates should be from 1 to 3!");
                        flag = false;
                        break;
                    default :
                        System.out.println("You should enter numbers!");
                        flag = false;
                        break;
                }
            }
            if (counter == 2) {
                break;
            }
        }
        if (!makeTheMove(finalArray)) {
            enterCoordinates();
        }
    }

    public static boolean makeTheMove(int[] coordinates) {
        int coordinate1 = coordinates[0] -1;
        int coordinate2 = coordinates[1] -1;
        if (' ' == (gameBoard[coordinate1][coordinate2])) {
            gameBoard[coordinate1][coordinate2] = 'X';
            return true;
        } else {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String symbolString = scanner.nextLine();
        symbolString = symbolString.replace("_", " ");
        char[] symbolChar = symbolString.toCharArray();
        int index = 0;
        for (int i = 0; i < gameBoard.length; i++){
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = symbolChar[index];
                if (gameBoard[i][j] == 'X') {
                    totalX++;
                } else if (gameBoard[i][j] == 'O')
                {
                    totalO++;
                }
                index++;
            }
        }

        printBoard();
        enterCoordinates();
        printBoard();

        // checkGame(gameBoard);
    }
}
