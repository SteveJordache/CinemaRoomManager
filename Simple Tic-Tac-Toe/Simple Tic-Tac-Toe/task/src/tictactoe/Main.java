package tictactoe;
import java.util.Scanner;

public class Main {
    public static char[][] gameBoard = new char[3][3];
    public static int totalX = 0;
    public static int totalO = 0;
    public static boolean isPossible;
    public static int counter = 0;
    public static int[] finalArray = new int[2];
    public static char previous = 'X';
    public static String finalMessage ="" ;

    public static boolean checkGame(char[][] gameBoard) {
        char winningParty = 0;
        isPossible = totalX - totalO >= -1 && totalX - totalO <= 1;
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][0] == gameBoard[i][2]) {
                if (gameBoard[i][0] != ' ') {
                    winningParty = gameBoard[i][0];
                    counter++;
                }

            }
        }
        for (int j = 0; j < gameBoard.length; j++) {
            if (gameBoard[0][j] == gameBoard[1][j] && gameBoard[0][j] == gameBoard[2][j]) {
                if (gameBoard[0][j] != ' ') {
                    winningParty = gameBoard[0][j];
                    counter++;
                }
            }
        }
        if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2]) {
            if (gameBoard[0][0] != ' ') {
                winningParty = gameBoard[0][0];
                counter++;
            }
        }
        if (gameBoard[0][2] == gameBoard[1][1] && gameBoard[0][2] == gameBoard[2][0]) {
            if (gameBoard[2][0] != ' ') {
                winningParty = gameBoard[2][0];
                counter++;
            }

        }
        if (isPossible && counter == 0 && totalX + totalO < 9) {
            finalMessage = "Game not finished";
            return true;
        } else if (isPossible && totalO + totalX == 9 && counter == 0) {
            finalMessage ="Draw";
            return false;
        } else if (isPossible && counter == 1 ) {
            finalMessage = String.format("%c wins", winningParty);
            return false;
        }
        else if (!isPossible || counter > 1) {
            finalMessage = "Impossible";
            return  false;

        }
        return true;
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
        boolean loop = true;
        while (loop) {
            boolean flag = true;
            int counterJ = 0;
            System.out.print("Enter the coordinates: ");
            String[] tempArray = scanner.nextLine().split(" ");
            for (int t = 0; t < 2 && flag; t++) {
                switch (tempArray[t]) {
                    case "1":
                        finalArray[t] = 1;
                        counterJ++;
                        break;
                    case "2":
                        finalArray[t] = 2;
                        counterJ++;
                        break;
                    case "3":
                        finalArray[t] = 3;
                        counterJ++;
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
                }
            }
            if (counterJ ==2 && makeTheMove(finalArray, previous)) {
                loop = false;
            }
        }
    }

    public static boolean makeTheMove(int[] coordinates, char sign) {
        int coordinate2 = coordinates[0] -1;
        int coordinate1 = coordinates[1] -1;
        if (' ' == (gameBoard[coordinate2][coordinate1])) {
            gameBoard[coordinate2][coordinate1] = sign;
            if (sign  == 'X'){
                totalX++;
            } else if (sign =='O') {
                totalO++;
            }
            previous = sign == 'X' ? 'O' : 'X';
            return true;
        } else {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }

    }
    public static void main(String[] args) {
        String symbolString = "_________";
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
        boolean stillLooping = true;
        while (stillLooping) {
            enterCoordinates();
            printBoard();
            stillLooping = checkGame(gameBoard);
            if (!stillLooping) {
                System.out.println(finalMessage);
            }
        }
    }
}
