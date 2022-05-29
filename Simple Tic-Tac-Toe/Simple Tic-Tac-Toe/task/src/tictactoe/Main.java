package tictactoe;
import java.util.Scanner;


public class Main {
    public static char[][] gameBoard = new char[3][3];
    public static int totalX = 0;
    public static int totalO = 0;
    public static boolean gameCompleted = false;
    public static boolean isPossible;
    public static int counter = 0;


    public static void checkGame(char[][] gameBoard) {
        char winningParty;
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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String symbolString = scanner.nextLine();
/*        System.out.println("---------");

        for (int j =0; j < 9; j += 3) {
            char poz1 = symbolString.charAt(j);
            char poz2 = symbolString.charAt(j+1);
            char poz3 = symbolString.charAt(j+2);
            System.out.printf("| %s %s %s |%n", poz1, poz2, poz3);
        }
        System.out.println("---------");*/
        for (int i =  0; i <gameBoard.length; i++) {
            for (int j =0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] =symbolString.charAt(i+j);
                if (symbolString.charAt(i+j) == 'X') {
                    totalX++;
                } else if ((symbolString.charAt(i+j) == 'O')) {
                    totalO++;
                }
            }
        }
        // System.out.println();
        System.out.println("---------");
        for ( int t =0; t <gameBoard.length; t++) {
            System.out.print("| ");
            for( int z =0; z <gameBoard[t].length; z++) {
                System.out.print(gameBoard[t][z] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("---------");
        checkGame(gameBoard);
    }
}
