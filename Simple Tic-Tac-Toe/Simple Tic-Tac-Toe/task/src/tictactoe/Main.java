package tictactoe;
import java.util.Arrays;
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

    public static  boolean checkCoordinates(String[] coordinates) {
        return  true;
    }

    public static void makeTheMove(String[] coordinates) {

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
        System.out.print("Enter the coordinates: ");
        String coordinates = scanner.nextLine();
        String[] coordinatesArray = coordinates.split(" ");
        System.out.println(Arrays.toString(coordinatesArray));
        while (true) {
            if (checkCoordinates(coordinatesArray)) {
                makeThemove(coordinatesArray);
            }
        }

        // checkGame(gameBoard);
    }
}
